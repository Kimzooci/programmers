public class Solution {
    public static int solution(String s) {
        String[] elements = s.split(" ");  // 문자열을 공백을 기준으로 나누어 배열로 저장합니다.
        int result = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals("Z")) {
                // "Z"가 나오면 바로 전에 더했던 숫자를 뺍니다.
                result -= Integer.parseInt(elements[i - 1]);
            } else {
                // "Z"가 아니면 숫자를 더합니다.
                result += Integer.parseInt(elements[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // 테스트
        System.out.println(solution("1 2 Z 3"));  // 결과: 4
        System.out.println(solution("10 20 30 40"));  // 결과: 100
        System.out.println(solution("10 Z 20 Z 1"));  // 결과: 1
        System.out.println(solution("10 Z 20 Z"));  // 결과: 0
        System.out.println(solution("-1 -2 -3 Z"));  // 결과: -3
    }
}
