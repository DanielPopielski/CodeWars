class WhoLikesIt {
    public String whoLikesIt(String... names) {
        String[] namesOfWhoLikesIt = names;
        int counterForOthers = namesOfWhoLikesIt.length-2;
        String result = "";

        if (namesOfWhoLikesIt.length == 0) {
            return result =  "no one likes this";
        } else if (namesOfWhoLikesIt.length == 1) {
            return result = namesOfWhoLikesIt[0] + " likes this";
        } else if (namesOfWhoLikesIt.length == 2) {
            return result =  namesOfWhoLikesIt[0] + " and " + namesOfWhoLikesIt[1] + " like this";
        } else if (namesOfWhoLikesIt.length == 3) {
            return result =  namesOfWhoLikesIt[0] + ", " + namesOfWhoLikesIt[1] + " and " + namesOfWhoLikesIt[2] + " like this";
        } else if (namesOfWhoLikesIt.length >= 4) {
            return result =  namesOfWhoLikesIt[0] + ", " + namesOfWhoLikesIt[1] + " and " + counterForOthers + " others like this";
        }
        return result;
    }
}