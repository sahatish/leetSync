class Solution {
    public double[] sampleStats(int[] count) {

        double min = -1;
        double max = -1;
        double mean = 0;
        double median = 0;
        double mode = 0;

        long total = 0;
        long sum = 0;

        int maxCount = 0;

        for( int i = 0; i < 256; i++) {

            if(count[i] > 0) {

                if(min == -1) {
                    min = i;
                }

                max = i;

                sum += (long) i * count[i];
                total += count[i];

                if( count[i] > maxCount){
                    maxCount = count[i];
                    mode = i;
                }
            }
        }

        mean = (double) sum / total;

        long mid1 = (total - 1) / 2;
        long mid2 = total / 2;

        long current = 0;
        double val1 = 0;
        double val2 = 0;

        for( int i = 0; i < 256; i++){

            current += count[i];

            if( current > mid1 && val1 == 0){
                val1 = i;
            }

            if(current >  mid2) {
                val2 = i;
                break;
            }
        }
        median = ( val1 + val2) / 2.0;

        return new double[]{min, max, mean, median, mode};
    }
}