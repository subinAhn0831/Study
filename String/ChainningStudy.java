package String;

public class ChainningStudy {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("h").append("e").append("l").append("l").append("o")
                .insert(5, ":)")
                .delete(5,7);

        System.out.println(sb);
    }
}
