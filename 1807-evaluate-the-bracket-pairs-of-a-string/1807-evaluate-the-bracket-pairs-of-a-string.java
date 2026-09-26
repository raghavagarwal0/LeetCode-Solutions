class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map map = new HashMap<>();
        for (List pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder result = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean insideBracket = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                insideBracket = true;
                key.setLength(0);
            } else if (c == ')') {
                insideBracket = false;
                result.append(map.getOrDefault(key.toString(), "?"));
            } else {
                if (insideBracket) {
                    key.append(c);
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}