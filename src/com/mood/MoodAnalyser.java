package com.mood;

    public class MoodAnalyser {
        private String message;

        public MoodAnalyser() {
            this.message = null;
        }

        public MoodAnalyser(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String analyseMood() {
            try {
                if (message.toLowerCase().contains("sad")) {
                    return "SAD";
                }
                else {
                    return "HAPPY";
                }
            }
            catch (NullPointerException e) {
                return "HAPPY";
            }
        }

        public static void main(String args[]) {
            System.out.println("Mood Analyser");

            MoodAnalyser moodAnalyser = new MoodAnalyser();

            moodAnalyser.setMessage("Happy");
            System.out.println(moodAnalyser.analyseMood());

            moodAnalyser.setMessage("Sad");
            System.out.println(moodAnalyser.analyseMood());

            moodAnalyser.setMessage(null);
            System.out.println(moodAnalyser.analyseMood());
        }
    }

