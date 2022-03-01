package com.zhe.other;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 一个圆环上有 100 个灯泡，灯泡有亮和暗两种状态。按一个灯泡的开关可以改变它和与它相邻两个灯泡的状态。
 * 设计一种算法，对于任意初始状态，使所有灯泡全亮。
 */
public class LightQuestion {

    public static void main(String[] args) {
        LightQuestion lightQuestion = new LightQuestion();
        LoopLight loopLight = lightQuestion.getInitLights(100);
       lightQuestion.execute(loopLight);

        while (true) {
            System.out.println(loopLight.getCurrent().getId() + " == " + loopLight.getCurrent().getStatus());
            if (loopLight.getCurrent().getId() > loopLight.getLater().getCurrent().getId()) {
                break;
            }
            loopLight = loopLight.later;
        }
    }

    private void execute(LoopLight loopLight) {
        LoopLight head = loopLight;
        for (int i = 0; i < 98; i ++) {
            if (head.getCurrent().getStatus() == 0) {
                changeLightStatus(head.getLater());
            }
            head = head.getLater();
        }

        if (head.getCurrent().getStatus() == 1 && head.getLater().getCurrent().getStatus() == 1) {
            return;
        }

        if (head.getCurrent().getStatus() == 0 && head.getLater().getCurrent().getStatus() == 0){
             changeLightStatus(head.getLater());
             head = head.getLater().getLater().getLater().getLater();
        } else if (head.getCurrent().getStatus() == 0) {
            head = head.getLater().getLater();
        } else {
            head = head.getLater().getLater().getLater();
        }


        for (int i = 0; i < 33; i++) {
            changeLightStatus(head);
            head = head.getLater().getLater().getLater();
        }

        head = loopLight;
        for (int i = 0; i < 100; i++) {
            changeLightStatus(head);
            head = head.getLater();
        }

    }

    private static void changeLightStatus(LoopLight loopLight) {
        loopLight.getCurrent().setStatus(loopLight.getCurrent().getStatus() ^ 1);
        loopLight.getPre().getCurrent().setStatus(loopLight.getPre().getCurrent().getStatus() ^ 1);
        loopLight.getLater().getCurrent().setStatus(loopLight.getLater().getCurrent().getStatus() ^ 1);
    }

    private LoopLight getInitLights(int n) {
        List<LoopLight> lights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            LoopLight loopLight = new LoopLight();
            loopLight.setCurrent(new Light(i, ThreadLocalRandom.current().nextInt(2)));
            lights.add(loopLight);
        }

        LoopLight loopLight = null;
        for (int i = 0, size = lights.size(); i < size; i++) {
            LoopLight current = lights.get(i);
            if (i == 0) {
                current.setPre(lights.get(size - 1));
                current.setLater(lights.get(i + 1));
                loopLight = current;
                continue;
            }

            if (i == size - 1) {
                current.setPre(lights.get(i - 1));
                current.setLater(lights.get(0));
                continue;
            }
            current.setPre(lights.get(i - 1));
            current.setLater(lights.get(i + 1));
        }

        return loopLight;
    }

    private static class LoopLight {
        private LoopLight pre;

        private LoopLight later;

        private Light current;

        public LoopLight getPre() {
            return pre;
        }

        public void setPre(LoopLight pre) {
            this.pre = pre;
        }

        public LoopLight getLater() {
            return later;
        }

        public void setLater(LoopLight later) {
            this.later = later;
        }

        public Light getCurrent() {
            return current;
        }

        public void setCurrent(Light current) {
            this.current = current;
        }
    }

    private static class Light {

        /**
         * 编号
         */
        private int id;

        /**
         * 状态
         * 0:暗 1：亮
         */
        private int status;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Light(int id, int status) {
            this.id = id;
            this.status = status;
        }
    }

}
