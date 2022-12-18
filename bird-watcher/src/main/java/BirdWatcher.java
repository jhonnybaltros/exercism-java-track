class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] result = new int[7];
        for (int i = 0; i < 7; i++) {
            result[i] = birdsPerDay[i];
        }
        return result;
    }

    public int getToday() {
        if(birdsPerDay.length == 0) return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int day : birdsPerDay ) {
            if (day == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for (int i = 0; i < numberOfDays; i++) {
            total = total + birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int total = 0;

        for(int i : birdsPerDay) {
            if(i >= 5) {
               total++;
            }
        }

        return total;
    }
}