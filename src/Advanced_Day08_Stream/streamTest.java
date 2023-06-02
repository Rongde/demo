package Advanced_Day08_Stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

public class streamTest {

    public static class TextInput {
        private String s;

        public TextInput() {
        }

        public TextInput(String s) {
            this.s = s;
        }

        public void add(char c) {
            String ch = String.valueOf(c);
            System.out.println(c);
            StringBuilder sb=new StringBuilder(s);
            s = sb.append(ch).toString();
            setS(s);
            System.out.println(s);
        }

        public String getValue() {
            return this.s;
        }


        /**
         * 获取
         * @return s
         */
        public String getS() {
            return s;
        }

        /**
         * 设置
         * @param s
         */
        public void setS(String s) {
            this.s = s;
        }

        public String toString() {
            return "TextInput{s = " + s + "}";
        }
    }

    public static class NumericInput extends TextInput{
        private String s;

        @Override
        public void add(char c) {
            if (c < 'a' & c >= 'z') {
                String ch = String.valueOf(c);
                StringBuilder sb=new StringBuilder(s);
                s = sb.append(ch).toString();
            };
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
//        input.add('1');
//        input.add('a');
//        input.add('0');
        System.out.println(input.getValue());


    }
}
