import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
 public class Geometria_Melani{
        Scanner sc = new Scanner(System.in);
        double AreaCua;
        double AreaTri;
        double AreRect;
        double AreaParalelo;

        double PerimeRombo;
        double PerimeTrapecio;
        double PerimeCirculo;
        double PerimeRegu;

        double VolCubo;
        double VolCilin;
        double VolCono;
        double VolEsfera;

        public Geometria_Melani(){
            AreaCua = 0;
            AreaTri = 0;
            AreRect = 0;
            AreaParalelo = 0;

            PerimeRombo = 0;
            PerimeTrapecio = 0;
            PerimeCirculo = 0;
            PerimeRegu = 0;

            VolCubo= 0;
            VolCilin = 0;
            VolCono = 0;
            VolEsfera = 0;
        }

        public double getAreaCua() {
            return AreaCua;
        }

        public void setAreaCua(double areaCua) {
            AreaCua = areaCua;
        }

        public double getAreaTri() {
            return AreaTri;
        }

        public void setAreaTri(double areaTri) {
            AreaTri = areaTri;
        }

        public double getAreRect() {
            return AreRect;
        }

        public void setAreRect(double areRect) {
            AreRect = areRect;
        }

        public double getAreaParalelo() {
            return AreaParalelo;
        }

        public void setAreaParalelo(double areaParalelo) {
            AreaParalelo = areaParalelo;
        }

        public double getPerimeRombo() {
            return PerimeRombo;
        }

        public void setPerimeRombo(double perimeRombo) {
            PerimeRombo = perimeRombo;
        }

        public double getPerimeTrapecio() {
            return PerimeTrapecio;
        }

        public void setPerimeTrapecio(double perimeTrapecio) {
            PerimeTrapecio = perimeTrapecio;
        }

        public double getPerimeCirculo() {
            return PerimeCirculo;
        }

        public void setPerimeCirculo(double perimeCirculo) {
            PerimeCirculo = perimeCirculo;
        }

        public double getPerimeRegu() {
            return PerimeRegu;
        }

        public void setPerimeRegu(double perimeRegu) {
            PerimeRegu = perimeRegu;
        }

        public double getVolCubo() {
            return VolCubo;
        }

        public void setVolCubo(double volCubo) {
            VolCubo = volCubo;
        }

        public double getVolCilin() {
            return VolCilin;
        }

        public void setVolCilin(double volCilin) {
            VolCilin = volCilin;
        }

        public double getVolCono() {
            return VolCono;
        }

        public void setVolCono(double volCono) {
            VolCono = volCono;
        }

        public double getVolEsfera() {
            return VolEsfera;
        }

        public void setVolEsfera(double volEsfera) {
            VolEsfera = volEsfera;
        }

        private double ladocua , basetri, alturatri,baserec,alturarec,basepara,alturapara;
        private double resul_cuadrado,result_triangulo,result_rectangulo,result_paralelo;


        public void Ingreso_Areas()
        {
            int op = 0;
            System.out.println("\t^_^_^_^_^_^_^  A-R-E-A-S  ^_^_^_^_^_^_^");
            System.out.println("1.- Area Cuadrado ");
            System.out.println("2.- Area Triangulo ");
            System.out.println("3.- Area Rectangulo ");
            System.out.println("4.- Area Paralelogramo");
            System.out.println("Elija la Opcion que Desea");
            System.out.print(">>");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ha Seleccionado la Primera Opcion");
                    do {
                        System.out.print("Ingrese el Lado del Cuadrado: ");
                        ladocua = sc.nextDouble();
                        if (ladocua<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while (ladocua<=0);
                    resul_cuadrado = pow(ladocua, 2);
                    setAreaCua(resul_cuadrado);
                    System.out.println("El Area del Cuadrado es: " +getAreaCua());


                    break;
                case 2:
                    System.out.println("Ha Seleccionado la Segunda Opcion");
                    do {
                        System.out.print("Ingrese la base del Triangulo: ");
                        basetri = sc.nextDouble();
                        if(basetri<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while(basetri <= 0);
                    do {
                        System.out.print("Ingrese la Altura del Triangulo: ");
                        alturatri = sc.nextDouble();
                        if(alturatri<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while(alturatri<=0);
                    result_triangulo = ((basetri * alturatri) / 2);
                    setAreaTri(result_triangulo);
                    System.out.println("El Area del Triangulo es: "+getAreaTri());

                    break;
                case 3:
                    System.out.println("Ha Seleccionado la Tercera Opcion");
                    do {
                        System.out.print("Ingrese la base del Rectangulo: ");
                        baserec = sc.nextDouble();
                        if(baserec<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while(baserec<0);
                    do {
                        System.out.print("Ingrese la altura del Rectangulo: ");
                        alturarec = sc.nextDouble();
                        if (alturarec<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while(alturarec<=0);
                    result_rectangulo = (baserec * alturarec);
                    setAreRect(result_rectangulo);
                    System.out.println("El Area del Rectangulo es: " + getAreRect());

                    break;
                case 4:
                    System.out.println("Ha Seleccionado la Cuarta Opcion");
                    do {
                        System.out.print("Ingrese la base del Paralelogramo: ");
                        basepara = sc.nextDouble();
                        if (basepara<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while (basepara<=0);

                    do {
                        System.out.print("ingrese la altura del Paralelogramo: ");
                        alturapara = sc.nextDouble();
                        if (alturapara<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while (alturapara<=0);
                    result_paralelo = (basepara * alturapara);
                    setAreaParalelo(result_paralelo);
                    System.out.println("La Area del Paralelogramo es: " + getAreaParalelo());
                    break;
            }


        }
        private double ladorom, basemayor, basemenor, ladouno, ladodos, radiocir, numla, medidalado;
        private double result_rombo, result_trapecio, result_circulo, result_poliregu;

        public void  Ingreso_Perimetro()
        {

            int opcion = 0;
            System.out.println("\t^_^_^_^_^_^_^ P.E.R.I.M.E.T.R.O.S ^_^_^_^_^_^_^");
            System.out.println("1.- Perimetro Del Rombo ");
            System.out.println("2.- Perimetro Del Trapecio ");
            System.out.println("3.- Perimetro Del Circulo ");
            System.out.println("4.- Perimetro De Un Poligono Regular");
            System.out.println("Elija la Opcion que Desea");
            System.out.print(">>");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha Seleccionado la Primera Opcion");
                    do {
                        System.out.print("Ingrese el lado del Rombo: ");
                        ladorom = sc.nextDouble();
                        if (ladorom<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while(ladorom<=0);
                    result_rombo = (4 * ladorom);
                    setPerimeRombo(result_rombo);
                    System.out.println("El Perimetro del Rombo es: " + getPerimeRombo());

                    break;
                case 2:
                    System.out.println("Ha Seleccionado la Segunda Opcion");
                    do {
                        System.out.print("Ingrese la base mayor del Trapecio: ");
                        basemayor = sc.nextDouble();
                        if(basemayor<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while (basemayor<=0);
                    do{
                        System.out.print("Ingrese la base menor del Trapecio: ");
                        basemenor = sc.nextDouble();
                        if(basemenor<=0){
                            System.out.println("Entrada no valida ");
                        }
                    }while(basemenor<=0);
                    do{
                        System.out.print("Ingrese el lado del Trapecio: ");
                        ladouno = sc.nextDouble();
                        if(ladouno<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while(ladouno<=0);
                    do {
                        System.out.print("Ingrese el segundo lado del Trapecio: ");
                        ladodos = sc.nextDouble();
                        if(ladodos<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (ladodos<=0);
                    result_trapecio = basemayor + basemenor + ladouno + ladodos;
                    setPerimeTrapecio(result_trapecio);
                    System.out.println("El Perimetro del Trapecio es: "+getPerimeTrapecio());
                    break;
                case 3:
                    System.out.println("Ha Seleccionado la Tercera Opcion");
                    do{
                        System.out.print("Ingrese el radio del Circulo: ");
                        radiocir = sc.nextDouble();
                        if (radiocir<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (radiocir<=0);
                    result_circulo = (2 * PI * radiocir);
                    setPerimeCirculo(result_circulo);
                    System.out.println("El Perimetro del Circulo es: "+getPerimeCirculo());

                    break;
                case 4:
                    System.out.println("Ha Seleccionado la Cuarta Opcion");
                    do{
                        System.out.print("Ingrese el numero de lados de un Poligono Regular: ");
                        numla = sc.nextDouble();
                        if (numla<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (numla<=0);

                    do{
                        System.out.print("Ingrese el valor del lado del Poligono Regular: ");
                        medidalado=sc.nextDouble();
                        if(medidalado<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while(medidalado<=0);
                    result_poliregu = (numla*medidalado);
                    setPerimeRegu(result_poliregu);
                    System.out.println("El Perimetro del Poligono Regular es: "+getPerimeRegu());

                    break;
                default:
            }
        }

        private double ladocubo,radioCil,alturaCil,alturaCono,radioCono,radioesf;
        private double result_cubo,result_cilin,result_cono,result_esfera;

        public void Ingreso_Volumen(){
            int opciones = 0;
            System.out.println("\t^_^_^_^_^_^_^ V-O-L-U-M-E-N ^_^_^_^_^_^_^");
            System.out.println("1.- Volumen Del Cubo ");
            System.out.println("2.- Volumen Del Cilindro ");
            System.out.println("3.- Volumen Del Cono ");
            System.out.println("4.- Volumen Esfera  ");
            System.out.println("Elija la Opcion que Desea");
            System.out.print(">>");
            opciones = sc.nextInt();
            switch (opciones){
                case 1:
                    System.out.println("Ha Seleccionado la Primera Opcion");
                    do{
                        System.out.print("Ingrese el lado del Cubo: ");
                        ladocubo = sc.nextDouble();
                        if (ladocubo<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (ladocubo<=0);
                    result_cubo = pow(ladocubo,3);
                    setVolCubo(result_cubo);
                    System.out.println("El Volumen del Cubo es: "+getVolCubo());
                    break;
                case 2:
                    System.out.println("Ha Seleccionado la Segunda Opcion");
                    do {
                        System.out.print("Ingrese el radio del Cilindro:  ");
                        radioCil=sc.nextDouble();
                        if (radioCil<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (radioCil<=0);

                    do {
                        System.out.print("Ingrese la altura del Cilindro: ");
                        alturaCil=sc.nextDouble();
                        if (alturaCil<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (alturaCil<=0);
                    result_cilin = (PI*pow(radioCil,2)*alturaCil);
                    setVolCilin(result_cilin);
                    System.out.println("El Volumen del Cilindro es: "+getVolCilin());

                    break;
                case 3:
                    System.out.println("Ha Seleccionado la Tercera Opcion");
                    do{
                        System.out.print("Ingrese el radio del Cono: ");
                        radioCono=sc.nextDouble();
                        if (radioCono<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (radioCono<=0);
                    do {
                        System.out.print("Ingrese la altura del Cono: ");
                        alturaCono=sc.nextDouble();
                        if (alturaCono<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (alturaCono<=0);
                    result_cono=((PI*pow(radioCono,2)*alturaCono)/3);
                    setVolCono(result_cono);
                    System.out.println("El Volumen del Cono es: "+getVolCono());
                    break;
                case 4:
                    System.out.println("Ha Seleccionado la Cuarta Opcion");
                    do {
                        System.out.print("Ingrese el radio de la Esfera: ");
                        radioesf = sc.nextDouble();
                        if (radioesf<=0){
                            System.out.println("Entrada no valida");
                        }
                    }while (radioesf<=0);
                    result_esfera = (4/3)* PI * pow(radioesf,3);
                    setVolEsfera(result_esfera);
                    System.out.println("El Volumen de la Esfera es: "+getVolEsfera());
                    break;
                default:
            }
        }


    }



