public class MyTime {

        private int mHour;
        private int mMinute;
        private int mSecond;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second){

        }
        public void setTime ( int hour, int minute, int second){
            int outofrange = 0;
            if (hour < 0 || hour > 23) {
                mHour = 0;
                outofrange = 1;
            } else mHour = hour;
            if (minute < 0 || minute > 59) {
                mMinute = 0;
                outofrange = 1;
            } else mMinute = minute;
            if (second < 0 || second > 59) {
                mSecond = 0;
                outofrange = 1;
            } else mSecond = second;

            if (outofrange == 1) {
                mHour = 0;
                mMinute = 0;
                mSecond = 0;
            }
            public int getHour () {
                return mHour;
            }
            public int getMinute () {
                return mMinute;
            }

            public int getSecond () {
                return mSecond;
            }

            public boolean equals (MyTime other){
                return (mHour == other.mHour && mMinute == other.mMinute && mSecond == other.mSecond);
            }


        }

    public void setmHour(int mHour) {
        this.mHour = mHour;
    }

    public void setmMinute(int mMinute) {
        this.mMinute = mMinute;
    }

    public void setmSecond(int mSecond) {
        this.mSecond = mSecond;
    }

    public String toString ()
        {
            int shortHour = 12;
            String AmOrPm = "AM";
            if (mHour > 12) {
                shortHour = mHour - 12;
                AmOrPm = "PM";
            } else if (mHour == 12)
                AmOrPm = "PM";
            else if (mHour == 0)
                shortHour = 12;
            else
                shortHour = mHour;

            String result = twoDigits(shortHour) + ":" +
            return result;

        }
        public String toUniversalString ()
        {
            String result = twoDigits(mHour) + ":" +
            return result;
        }
    }
        private String twoDigits(int value)
        {
            String result;
            if(value < 10)
                result = "0" + Integer.toString(value);
            else
                result = Integer.toString(value);
            return result;
        }
