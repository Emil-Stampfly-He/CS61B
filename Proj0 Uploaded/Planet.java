public class Planet {
    public double xxPos; public double yyPos;
    public double xxVel; public double yyVel;
    public double mass; public String imgFileName;
    private static final double G = 6.67e-11;

    public Planet(double xxPos, double yyPos,
                  double xxVel, double yyVel,
                  double mass, String imgFileName) {
        this.xxPos = xxPos; this.yyPos = yyPos;
        this.xxVel = xxVel; this.yyVel = yyVel;
        this.mass = mass; this.imgFileName = imgFileName;
    }

    public Planet(Planet p) {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    public double calcDistance(Planet p) {
        double dx = this.xxPos - p.xxPos;
        double dy = this.yyPos - p.yyPos;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double calcForceExertedBy(Planet p) {
        return (this.mass * p.mass * G) / Math.pow(calcDistance(p), 2);
    }

    public double calcForceExertedByX(Planet p) {
        double force = calcForceExertedBy(p);
        double distance = calcDistance(p);
        double dx = p.xxPos - this.xxPos;
        return force * dx / distance;
    }

    public double calcForceExertedByY(Planet p) {
        double force = calcForceExertedBy(p);
        double distance = calcDistance(p);
        double dy = p.yyPos - this.yyPos;
        return force * dy / distance;
    }

    public double calcNetForceExertedByX(Planet[] allPlanets) {
        double netForceX = 0;
        for (Planet p : allPlanets) {
            if(!this.equals(p)) {
                netForceX += calcForceExertedByX(p);
            }
        }
        return netForceX;
    }

    public double calcNetForceExertedByY(Planet[] allPlanets) {
        double netForceY = 0;
        for (Planet p : allPlanets) {
            if(!this.equals(p)) {
                netForceY += calcForceExertedByY(p);
            }
        }
        return netForceY;
    }

    public void update(double dt, double fX, double fY) {
        double aX = fX / this.mass;
        double aY = fY / this.mass;

        this.xxVel += aX * dt;
        this.yyVel += aY * dt;

        this.xxPos += xxVel * dt;
        this.yyPos += yyVel * dt;
    }

    public void draw() {
        StdDraw.picture(xxPos, yyPos, "images/" + imgFileName);
    }
}
