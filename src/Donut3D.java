public class Donut3D {
    private static final int WIDTH = 80;
    private static final int HEIGHT = 24;
    private static final String SHADES = ".,-~:;=!*#$@";

    public static void main(String[] args) throws InterruptedException {
        double angleA = 0;
        double angleB = 0;

        System.out.print("\033[2J");

        while (true) {
            char[] output = new char[WIDTH * HEIGHT];
            double[] zBuffer = new double[WIDTH * HEIGHT];

            for (int i = 0; i < output.length; i++) {
                output[i] = ' ';
                zBuffer[i] = 0;
            }

            double sinA = Math.sin(angleA);
            double cosA = Math.cos(angleA);
            double sinB = Math.sin(angleB);
            double cosB = Math.cos(angleB);

            for (double theta = 0; theta < 2 * Math.PI; theta += 0.07) {
                double sinTheta = Math.sin(theta);
                double cosTheta = Math.cos(theta);

                for (double phi = 0; phi < 2 * Math.PI; phi += 0.02) {
                    double sinPhi = Math.sin(phi);
                    double cosPhi = Math.cos(phi);

                    double circleX = 2 + cosTheta;
                    double circleY = sinTheta;

                    double x = circleX * (cosB * cosPhi + sinA * sinB * sinPhi) - circleY * cosA * sinB;
                    double y = circleX * (sinB * cosPhi - sinA * cosB * sinPhi) + circleY * cosA * cosB;
                    double z = 5 + cosA * circleX * sinPhi + circleY * sinA;
                    double inverseZ = 1 / z;

                    int screenX = (int) (WIDTH / 2.0 + 30 * inverseZ * x);
                    int screenY = (int) (HEIGHT / 2.0 - 15 * inverseZ * y);
                    int index = screenX + WIDTH * screenY;

                    double luminance = cosPhi * cosTheta * sinB
                            - cosA * cosTheta * sinPhi
                            - sinA * sinTheta
                            + cosB * (cosA * sinTheta - cosTheta * sinA * sinPhi);

                    if (screenY >= 0 && screenY < HEIGHT && screenX >= 0 && screenX < WIDTH && inverseZ > zBuffer[index]) {
                        zBuffer[index] = inverseZ;
                        int shadeIndex = Math.max(0, Math.min(SHADES.length() - 1, (int) (luminance * 8)));
                        output[index] = SHADES.charAt(shadeIndex);
                    }
                }
            }

            System.out.print("\033[H");
            for (int row = 0; row < HEIGHT; row++) {
                System.out.println(new String(output, row * WIDTH, WIDTH));
            }

            angleA += 0.04;
            angleB += 0.02;
            Thread.sleep(30);
        }
    }
}
