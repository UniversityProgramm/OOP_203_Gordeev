import java.io.IOException;
public class Vector {
    /**
     * <b> Класс векторов </b>
     * Класс Vector реализует приложение, которое
     * работает с векторами на плоскости
     * и демонстрирует работу всех методов с ними.
     *
     * @author Gordeev Stanislav
     * @version 1.0
     * @since 2023-10-14
     */

    double x1 = 0;
    double y1 = 0;

    double x2 = 0;
    double y2 = 0;

    double x = x2 - x1;
    double y = y2 - y1;

    /** Этот конструктор с параметрами создает вектор с заданными значениями
     * @param ix1 абсцисса начальной точки вектора
     * @param iy1 ордината начальной точки вектора
     * @param ix2 абсцисса конечной точки вектора
     * @param iy2 ордината конечной точки вектора
     */
    public Vector(double ix1, double iy1, double ix2, double iy2) {
        this.x1 = ix1;
        this.y1 = iy1;
        this.x2 = ix2;
        this.y2 = iy2;
    }
    /**
     * Это конструкто без параметров, он  создает вектор с дефолтными значениями
     */
    public Vector() {}

    /** Это геттер, возвращающий абсциссу началной точки
     * @return double - тип возвращаемого значения абсциссы начальной точки
     */
    public double getX1() {
        return x1;
    }
    /** Это геттер, возвращающий ординату началной точки
     * @return double - тип возвращаемого значения ординаты начальной точки
     */
    public double getY1() {
        return y1;
    }
    /** Это геттер, возвращающий абсциссу конечной точки
     * @return double - тип возвращаемого значения абсциссы конечной точки
     */
    public double getX2() {
        return x2;
    }
    /** Это геттер, возвращающий ординату конечной точки
     * @return double - тип возвращаемого значения ординаты нконечной точки
     */
    public double getY2() {
        return y2;
    }

    /** Это сеттер, меняющийЫ абсциссу началной точки
     * @param x1 новое значение абсциссы
     * @return double - тип возвращаемого значения абсциссы начальной точки
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }
    /** Это сеттер, меняющий ординату началной точки
     * @param y1 новое значение ординаты
     * @return double - тип возвращаемого значения ординаты начальной точки
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }
    /** Это сеттер, меняющий абсциссу конечной точки
     * @param x2 новое значение абсциссы
     * @return double - тип возвращаемого значения абсциссы конечной точки
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    /** Это сеттер, меняющий ординату конечной точки
     * @param y2 новое значение ординаты
     * @return double - тип возвращаемого значения ординаты нконечной точки
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     * Метод используется для нахождения векторного произведения текущего вектор на заданный вектор A.
     * @param A вектор, на который производится умножение
     * @return double - тип возвращаемого значения произведения векторов, равный площади параллелограмма,
     * натянутого на вектора(определителю матрицы, составленной из координат векторов) .
     */
    public double vectorMultiplication(Vector A) {
        double xA = A.x2- A.x1;
        double yA = A.y2- A.y1;

        return (x * yA - y * xA);
    }
    /**
     * Метод используется для нахождения скалярного произведения текущего вектор на вектор A.
     * @param A вектор, на который происходит умножение
     * @return double - тип возвращаемого значения скалярного произведения векторов.
     */
    public double scalarMultiplication(Vector A) {
        double scalar = x * A.x + y * A.y;
        return scalar;
    }
    /** Метод используется для нахождения длины вектора.
     * @return double - тип возвращаемого значения скалярного произведения векторов.
     */
    public double vectorLength() {
        double length = Math.sqrt(x * x + y * y);
        return length;
    }
    /** Метод используется для умножения вектора на число.
     * @param k число, на которое умножается вектор
     */
    public Vector digitOnVector(double k) {
        return new Vector(k * x1, k * y1, k * x2, k * y2);
    }
    /** Метод используется для нахождения суммы векторов, возвращающий вектор как результат операции
     * @param A вектор, c которым складываем наш вектор
     * @return Vector - тип возвращаемого значения суммы векторов.
     */
    public Vector vectorSumm(Vector A) {
        return new Vector(x2 + A.x2 - A.x1, x1 - A.x2 + A.x1, y2 + A.y2 - A.y1, y1 - A.y2 + A.y1);
    }
    /** Метод используется для нахождения разности векторов, возвращающий вектор как результат операции
     * @param A вектор, который вычитаем
     * @return Vector - тип возвращаемого значения разности векторов.
     */
    public Vector vectorSubtraction(Vector A) {
        return new Vector(x2 - A.x2 + A.x1, x1 + A.x2 - A.x1, y2 - A.y2 + A.y1, y1 + A.y2 - A.y1);
    }

    /**
     * Это основной метод, использующий методы класса Vector.
     * @param args Не используется.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */

    public static void main(String[] args) {
        Vector defolt = new Vector();
        Vector v1 = new Vector(1, 2, 3, 4);
        Vector v2 = new Vector(5, 6, 7, 8);

        System.out.println(v1.getX1());
        v1.setX1(5);
        System.out.println(v1.getX1());

        System.out.println(v1.vectorMultiplication(v2));
        System.out.println(v1.scalarMultiplication(v2));
        System.out.println(v1.vectorLength());
        v1.digitOnVector(2);
        System.out.println(v1.getX1() +  v1.getY1() + v1.getX2() + v1.getY2());
        Vector summ = v1.vectorSumm(v2);
        Vector subtract = v1.vectorSubtraction(v2);


    }
}