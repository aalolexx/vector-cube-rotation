public class Transformation
{
    // Rotates Vector v around given "r" axis with angle alpha
    /*
     *        / ... \
     * Rr =   | ... |
     *        \ ... /
     */
    public static double[] rotateR(double[] v, double[] r, double alpha) {
        double x = v[0] * ((r[0] * r[0]) * (1 - Math.cos(alpha)) + Math.cos(alpha))
                   + v[1] * ((r[0] * r[1]) * (1 - Math.cos(alpha)) - (r[2] * Math.sin(alpha)))
                   + v[2] * ((r[0] * r[2]) * (1 - Math.cos(alpha)) + (r[1] * Math.sin(alpha)));
        double y = v[0] * ((r[1] * r[0]) * (1 - Math.cos(alpha)) + (r[2] * Math.sin(alpha)))
                   + v[1] * ((r[1] * r[1]) * (1 - Math.cos(alpha)) + Math.cos(alpha))
                   + v[2] * ((r[1] * r[2]) * (1 - Math.cos(alpha)) - (r[0] * Math.sin(alpha)));
        double z = v[0] * ((r[2] * r[0]) * (1 - Math.cos(alpha)) - (r[1] * Math.sin(alpha)))
                   + v[1] * ((r[2] * r[1]) * (1 - Math.cos(alpha)) + (r[0] * Math.sin(alpha)))
                   + v[2] * ((r[2] * r[2]) * (1 - Math.cos(alpha)) + Math.cos(alpha));
        return new double[] {x, y, z};
    }
    
    // Rotates Vector v around X axis with angle alpha
    /*
     *        / 1   0      0     \
     * Rx =   | 0 cos(a) -sin(a) |
     *        \ 0 sin(a) cos(a)  /
     */
    public static double[] rotateX(double[] v, double alpha) {
        double x = v[0];
        double y = Math.cos(alpha) * v[1] - Math.sin(alpha) * v[2];
        double z = Math.sin(alpha) * v[1] + Math.cos(alpha) * v[2];
        return new double[] {x, y, z};
    }
    
    // Rotates Vector v around Y axis with angle alpha
    /*
     *        / cos(a)  0  sin(a) \
     * Ry =   |   0     1   0     |
     *        \ -sin(a) 0  cos(a) /
     */
    public static double[] rotateY(double[] v, double alpha) {
        double x = Math.cos(alpha) * v[0] + Math.sin(alpha) * v[2];
        double y = v[1];
        double z = -Math.sin(alpha) * v[0] + Math.cos(alpha) * v[2];
        return new double[] {x, y, z};
    }
    
    // Rotates Vector v around Z axis with angle alpha
    /*
     *        / cos(a) -sin(a) 0 \
     * Rz =   | sin(a)  cos(a) 0 |
     *        \   0       0    1 /
     */
    public static double[] rotateZ(double[] v, double alpha) {
        double x = Math.cos(alpha) * v[0] - Math.sin(alpha) * v[1];
        double y = Math.sin(alpha) * v[0] + Math.cos(alpha) * v[1];
        double z = v[2];
        return new double[] {x, y, z};
    }
}



