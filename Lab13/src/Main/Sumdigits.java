package Main;




public class Sumdigits {
    public static int sumDigitsfortest(int number) {
        int sum = 0; //จะถูกกำหนดค่าเริ่มต้นเป็น 0 เพื่อให้สามารถบวกเพิ่มค่าของหลักเลขทุกตัวเข้าไปได้

        while (number > 0) { //โค้ดจะทำการทำงานต่อไปเรื่อย ๆ จนกว่า number จะกลายเป็น 0:
            int digit = number % 10; //นำ number มา modulo ด้วย 10 (number % 10) เพื่อให้ได้หลักเลขที่ต่ำสุดของ number
            sum += digit; //นำหลักเลขนั้นไปบวกกับ sum.
            number /= 10; //หลักเลขที่ถูกนำมาใช้จะถูกลบออกจาก number โดยการหาร 10 (number /= 10) เพื่อทำให้ตัวเลขต่ำสุดถูกลบออก.
        }

        return sum; //ฟังก์ชันจะส่งค่า sum กลับ.
    }
}
