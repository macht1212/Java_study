import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float keyRate = 8.0f;
        float farEastKeyRate = 2.0f;

        float discountChildren = 1.0f;
        float discountSalaryProject = 0.5f;
        float discountInsurance = 1.5f;

        float rate;

        System.out.println("Добро пожаловать в ипотечный калькулятор! Пожалуйста, ответьте на следующие вопросы:");

        System.out.print("Проживаете на Дальнем Востоке?: ");
        String region = scanner.nextLine();

        System.out.print("Сколько у Вас детей?: ");
        byte children = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Хотели бы оформить в нашем банке страховку?: ");
        String insurance = scanner.nextLine();

        System.out.print("Есть ли в нашем банке зарплатный проект?: ");
        String salaryProject = scanner.nextLine();

        if (Objects.equals(region, "Да")) {
            if (Objects.equals(insurance, "Да")) {
                rate = farEastKeyRate - discountInsurance;
                System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
            } else {
                if (3 <= children) {
                    if (Objects.equals(salaryProject, "Да")) {
                        rate = farEastKeyRate - discountChildren - discountSalaryProject;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    } else {
                        rate = farEastKeyRate - discountChildren;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    }
                } else {
                    if (Objects.equals(salaryProject, "Да")) {
                        rate = farEastKeyRate - discountSalaryProject;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    } else {
                        rate = farEastKeyRate;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    }
                }

            }
        } else {
            if (Objects.equals(insurance, "Да")) {
                if (3 >= children) {
                    if (Objects.equals(salaryProject, "Да")) {
                        rate = keyRate - discountChildren - discountSalaryProject - discountInsurance;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    } else {
                        rate = keyRate - discountChildren - discountInsurance;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    }
                } else {
                    if (Objects.equals(salaryProject, "Да")) {
                        rate = keyRate - discountSalaryProject - discountInsurance;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    } else {
                        rate = keyRate - discountInsurance;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    }
                }
            } else {
                if (3 >= children) {
                    if (Objects.equals(salaryProject, "Да")) {
                        rate = keyRate - discountChildren - discountSalaryProject;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    } else {
                        rate = keyRate - discountChildren;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    }
                } else {
                    if (Objects.equals(salaryProject, "Да")) {
                        rate = keyRate - discountSalaryProject;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    } else {
                        rate = keyRate;
                        System.out.println("Ваша ипотечная ставка составит: " + rate + "%");
                    }
                }
            }
        }

    }
}