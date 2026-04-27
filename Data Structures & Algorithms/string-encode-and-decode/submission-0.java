class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        StringBuilder end = new StringBuilder("lakshayrockz");
        for (String s : strs) {
            result.append(s);
            end.append(s.length()).append("#");
        }
        result.append(end);
        return result.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>();
        String[] parts = str.split("lakshayrockz");
        String main = parts[0];
        String[] lengths = parts[1].split("#");
        List<String> result = new ArrayList<>();
        int index = 0;
        for (String i : lengths) {
            result.add(main.substring(index, index + Integer.parseInt(i)));
            index += Integer.parseInt(i);
        }
        return result;
    }
}
