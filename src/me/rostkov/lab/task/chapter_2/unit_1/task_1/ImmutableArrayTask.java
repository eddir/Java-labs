package me.rostkov.lab.task.chapter_2.unit_1.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ImmutableArrayTask extends BaseTask implements Task {
    public ImmutableArrayTask() {
        this.id = "2.1.1";
        this.title = "Неизменяемый массив";
        this.description = "Измените сущность Дом из задачи 1.4.3. Гарантируйте, что у дома всегда будет \n" +
                "положительное количество этажей. В случае попытки указать отрицательное количество этажей \n" +
                "должна выбрасываться соответствующая ошибка. Продемонстрируйте работоспособность решения на \n" +
                "примерах.";
    }

    @Override
    public void start(Scanner in) {
        ImmutableValueList list1, list2;

        list1 = new ImmutableValueList(1, 2, 3);
        list2 = new ImmutableValueList(new ArrayList<Integer>() {{
            add(2);
            add(4);
            add(6);
            add(8);
        }});

        System.out.println(list1.get(2));
        System.out.println(list1.isEmpty());
        System.out.println(list1.getSize());

        System.out.println(list2);
        list2.set(1, 0);
        System.out.println(Arrays.toString(list2.toArray()));
    }
}
