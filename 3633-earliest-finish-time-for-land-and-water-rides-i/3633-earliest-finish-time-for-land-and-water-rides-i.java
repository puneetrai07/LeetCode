class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd,
                    landStartTime[i] + landDuration[i]);
        }

        int landToWater = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            landToWater = Math.min(
                    landToWater,
                    Math.max(minLandEnd, waterStartTime[i]) + waterDuration[i]
            );
        }

        int minWaterEnd = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterEnd = Math.min(minWaterEnd,
                    waterStartTime[i] + waterDuration[i]);
        }

        int waterToLand = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            waterToLand = Math.min(
                    waterToLand,
                    Math.max(minWaterEnd, landStartTime[i]) + landDuration[i]
            );
        }

        return Math.min(landToWater, waterToLand);
    }
}