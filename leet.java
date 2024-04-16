class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        ff f = new ff();
        int maxLen = 0;

        for (int num : arr1) {
            f.insert(num);
        }

        for (int num : arr2) {
            maxLen = Math.max(maxLen, f.lcp(num));
        }

        return maxLen;
    }

    private class ff {
        private Tn root;

        public ff() {
            root = new Tn();
        }

        public void insert(int num) {
            Tn node = root;
            String str = String.valueOf(num);

            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';
                if (node.children[digit] == null) {
                    node.children[digit] = new Tn();
                }
                node = node.children[digit];
            }
            node.isEnd = true;
        }

        public int lcp(int num) {
            Tn node = root;
            String str = String.valueOf(num);
            int len = 0;

            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';
                if (node.children[digit] == null) {
                    return len;
                }
                node = node.children[digit];
                len++;
            }

            return len;
        }
    }

    private static class Tn {
        Tn[] children;
        boolean isEnd;

        public Tn() {
            children = new Tn[10];
            isEnd = false;
        }
    }
}