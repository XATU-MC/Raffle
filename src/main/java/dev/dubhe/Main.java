package dev.dubhe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final List<String> WYDJB = new ArrayList<>() {{
        add("664fbbb3-430e-4f8c-9fbe-debeeae2f9e0");
        add("a71ebc2a-0343-4e1a-b99d-43a111a465e5");
        add("21d5c350-1d17-41b9-9613-134b02fb4066");
        add("22dbd944-6907-4c55-bf7d-55c737e8afe6");
        add("21f06c7f-6ec1-4646-99d8-d22024b4e2f3");
    }};
    public static final List<String> zuozuomu = new ArrayList<>() {{
        add("34dec165-4ec6-4d02-a7c6-5fa939408f83");
        add("b00b4642-055d-47ee-893b-c4db5b86767c");
        add("ccd3ac2c-1438-41bc-bb2c-c50fd3b1fc16");
        add("8bce6362-acc6-41e1-be87-a5e9f224e1b2");
    }};
    public static final List<String> XLJ_Ricardo = new ArrayList<>() {{
        add("3c7f491d-c8c4-4dfb-a25a-db19227fd676");
        add("c0944d7b-71c1-4f0d-9ab9-8ded83875ac7");
        add("22b60f4d-1681-4d3d-95d2-ac2f9a6228bb");
        add("54c93822-1784-4d33-a470-c1b73a54f0cc");
    }};
    public static final List<String> get_right_d = new ArrayList<>() {{
        add("e919377d-412a-4b0b-a9e0-5c1a17452119");
        add("61a685b0-4142-414b-9ee6-15f5087c5aa3");
        add("5b75a31d-ff5f-481b-b102-3e584e411cd6");
        add("95aabce0-e4fa-49c6-90f0-ae09d49a8b05");
    }};
    public static final List<String> YanWenxs = new ArrayList<>() {{
        add("d1f7ae6a-e4ea-4690-b821-f78ed92508bc");
        add("b214d1ab-eef1-4d7b-90a9-c6ad70815386");
        add("e0b6aacf-49ca-459e-a51c-5978b44ec08c");
        add("4e1f8c86-b36c-49d9-afb5-4c0ca43fd65b");
    }};
    public static final List<String> Pigeon_Nian = new ArrayList<>() {{
        add("d1756862-bd42-4d78-8cd3-e1f5a5713a71");
        add("32af9837-2f10-4ed5-a94e-9ea241ee30cc");
        add("cb13f8ed-3915-405a-b9a3-1c6f2978d0d4");
    }};
    public static final List<String> HughQAQ = new ArrayList<>() {{
        add("d684eecd-179c-4e49-80a9-f565f67e1d22");
        add("b33e60a8-9451-4497-b8d8-29d9c2e071f1");
    }};
    public static final List<String> wangjue_cpj = new ArrayList<>() {{
        add("98bb3ce4-4489-460d-b8e0-6b5013c615f1");
        add("c2bed8e8-2c8d-4b07-86f3-42e74491cfb4");
    }};
    public static final List<String> jackpot = new ArrayList<>() {{
        addAll(WYDJB);
        addAll(zuozuomu);
        addAll(XLJ_Ricardo);
        addAll(get_right_d);
        addAll(YanWenxs);
        addAll(Pigeon_Nian);
        addAll(HughQAQ);
        addAll(wangjue_cpj);
    }};

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(10 - i);
        }
        System.out.println(jackpot.get(random.nextInt(jackpot.size())));
    }
}