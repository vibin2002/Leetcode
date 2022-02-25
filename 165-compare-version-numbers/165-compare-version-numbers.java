class Solution {
    public int compareVersion(String version1, String version2) {
        String s1[] = version1.split("\\.");
        String s2[] = version2.split("\\.");
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        int max = s1.length > s2.length ? s1.length : s2.length;
        int arr1[] = new int[max];
        int arr2[] = new int[max];
        for(int i=0;i<s1.length;i++){
            arr1[i] = Integer.parseInt(s1[i]);
        }
        for(int i=0;i<s2.length;i++){
            arr2[i] = Integer.parseInt(s2[i]);
        }

        for(int i=0;i<max;i++){
            if(arr1[i]<arr2[i])
                return -1;
            else if(arr1[i]>arr2[i])
                return 1;
        }
        return 0;
    }
}