package com.beightlyouch.mie;

public class QuizDataCity {
    private static final String poolcity[] []= new String[][]{
            {"asahi","kihoku","mihama","suzuka","tsu","iga","kisosaki","minamiise","taiki","watarai",
                    "inabe","komono","nabari", "taki","yokkaichi","ise","kumano","odai","tamaki",
                    "kameyama","kuwana","owase", "kawagoe","matsusaka","toba",
                    "kiho","meiwa","shima","toin"},

            {"朝日町", "紀北町", "御浜町", "鈴鹿市", "津市", "伊賀市", "木曽岬町", "南伊勢町", "大紀町", "度会町",
                    "いなべ市", "菰野町", "名張市", "多気町", "四日市市", "伊勢市", "熊野町", "大台町", "玉城町",
                    "亀山市", "桑名市", "尾鷲市", "川越町", "松阪市", "鳥羽市",
                    "紀宝町", "明和町", "志摩市", "東員町"}};

    public static String[][] getPoolcity(){
        return QuizDataCity.poolcity;
    }

    public static int getCityNum(){
        return poolcity.length;
    }
}
