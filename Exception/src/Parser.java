import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Double.parseDouble;


class Parser {
    public static void parse(String path) {
        File file = new File(path);
        try {
            int taskNumber = 1;
            FileWriter outputFile = new FileWriter("src/resource/output.txt");
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Решите уравнение:")) {
                    String equation = line.substring(line.indexOf(":") + 1).trim();
                    outputFile.write("===Task " + taskNumber + "===\n");
                    outputFile.write("Решите уравнение: " + equation + "\n");
                    try {
                        double result = Calculate.calculates(equation);
                        outputFile.write(Calculate.findVariable(equation) + " = " + formatDouble(result) + "\n");
                    }
                    catch (Exception e) {
                        outputFile.write("Не получается решить уравнение\n");
                    }
                    taskNumber++;
                }
                else if (line.startsWith("Найдите значение выражения:")) {
                    String expression = line.substring(line.indexOf(":") + 1).trim();
                    outputFile.write("===Task " + taskNumber + "===" + "\n");
                    outputFile.write("Найдите значение выражения: " + expression + "\n");
                    try {
                        List<Symbol> symbols = SymbolBuffer.symbolAnalyze(expression);
                        SymbolBuffer symbolBuffer = new SymbolBuffer(symbols);
                        double result = SymbolBuffer.expr(symbolBuffer);
                        if (Double.isInfinite(result)) {
                            outputFile.write("Ошибка: деление на ноль\n");
                        }
                        else {
                            outputFile.write(expression + " = " + formatDouble(result) + "\n");
                        }
                    }
                    catch (Exception e) {
                        outputFile.write("Не получается вычислить значение выражения\n");
                    }
                    taskNumber++;
                }
                else if(line.startsWith("Найдите решение квадратного уравнения:")){
                    String expression = line.substring(line.indexOf(":") + 1).trim();
                    outputFile.write("===Task " + taskNumber + "===" + "\n");
                    outputFile.write("Найдите решение квадратного уравнения: " + expression + "\n");
                    try {
                        String[] expressionWithoutSpaces = expression.split(" ");
                        List coeff = new ArrayList<>();
                        for (int i = 0; i < expressionWithoutSpaces.length; i++) {
                            if (expressionWithoutSpaces[i].matches("[a-zA-Zа-яА-Я]")) {
                                if (i == 0) coeff.add(1.0);
                                else {
                                    double k = parseDouble(expressionWithoutSpaces[i-2]);
                                    try{
                                        if (expressionWithoutSpaces[i-3].matches("-")) k *= -1;
                                    }
                                    catch (IndexOutOfBoundsException e) {}
                                    coeff.add(k);
                                }
                            }
                            if (expressionWithoutSpaces[i].matches( "=")){
                                double k = parseDouble(expressionWithoutSpaces[i-1]);
                                if (expressionWithoutSpaces[i-2].matches("-")) k *= -1;
                                coeff.add(k);
                            }
                        }
                        QuadraticEquationSolver quadraticSolver = (a, b, c) -> {
                            double discriminant = b * b - 4 * a * c;
                            if (discriminant < 0) {
                                return Arrays.asList();
                            }
                            else if (discriminant == 0) {
                                double root = -b / (2 * a);
                                return Arrays.asList(root);
                            }
                            else {
                                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                                return Arrays.asList(root1, root2);
                            }
                        };
                        double a = (double) coeff.get(0);
                        double b = (double) coeff.get(1);
                        double c = (double) coeff.get(2);
                        List<Double> roots = quadraticSolver.solveQuadraticEquation(a, b, c);
                        if (roots.isEmpty()) {
                            outputFile.write("Квадратное уравнение не имеет действительных корней.\n");
                        }
                        else if (roots.size() == 1) {
                            outputFile.write("x = " + formatDouble(roots.get(0)) + "\n");
                        }
                        else {
                            outputFile.write("x1 = " + formatDouble(roots.get(0)) + "; x2 = " + formatDouble(roots.get(1)) + "\n");
                        }
                    }
                    catch (Exception e) {
                        outputFile.write("Невозможно вычислить значение выражения\n");
                    }
                    taskNumber++;
                }
            }
            outputFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл " + path + " не найден");
        }
        catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }
    private static String formatDouble(double number) {
        if (number % 1 == 0) {
            return String.valueOf(number);
        }
        else {
            return String.format("%.3f", number);
        }
    }

}