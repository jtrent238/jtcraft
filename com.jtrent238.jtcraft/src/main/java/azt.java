/*     */ public class azt {
/*     */   public double a;
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   public double e;
/*     */   public double f;
/*     */   
/*   9 */   public static azt a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) { return new azt(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6); }
/*     */   
/*     */   protected azt(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*     */   {
/*  13 */     this.a = paramDouble1;
/*  14 */     this.b = paramDouble2;
/*  15 */     this.c = paramDouble3;
/*  16 */     this.d = paramDouble4;
/*  17 */     this.e = paramDouble5;
/*  18 */     this.f = paramDouble6;
/*     */   }
/*     */   
/*     */   public azt b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  22 */     this.a = paramDouble1;
/*  23 */     this.b = paramDouble2;
/*  24 */     this.c = paramDouble3;
/*  25 */     this.d = paramDouble4;
/*  26 */     this.e = paramDouble5;
/*  27 */     this.f = paramDouble6;
/*  28 */     return this;
/*     */   }
/*     */   
/*     */   public azt a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  32 */     double d1 = this.a;
/*  33 */     double d2 = this.b;
/*  34 */     double d3 = this.c;
/*  35 */     double d4 = this.d;
/*  36 */     double d5 = this.e;
/*  37 */     double d6 = this.f;
/*     */     
/*  39 */     if (paramDouble1 < 0.0D) d1 += paramDouble1;
/*  40 */     if (paramDouble1 > 0.0D) { d4 += paramDouble1;
/*     */     }
/*  42 */     if (paramDouble2 < 0.0D) d2 += paramDouble2;
/*  43 */     if (paramDouble2 > 0.0D) { d5 += paramDouble2;
/*     */     }
/*  45 */     if (paramDouble3 < 0.0D) d3 += paramDouble3;
/*  46 */     if (paramDouble3 > 0.0D) { d6 += paramDouble3;
/*     */     }
/*  48 */     return a(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public azt b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  52 */     double d1 = this.a - paramDouble1;
/*  53 */     double d2 = this.b - paramDouble2;
/*  54 */     double d3 = this.c - paramDouble3;
/*  55 */     double d4 = this.d + paramDouble1;
/*  56 */     double d5 = this.e + paramDouble2;
/*  57 */     double d6 = this.f + paramDouble3;
/*     */     
/*  59 */     return a(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public azt a(azt paramazt) {
/*  63 */     double d1 = Math.min(this.a, paramazt.a);
/*  64 */     double d2 = Math.min(this.b, paramazt.b);
/*  65 */     double d3 = Math.min(this.c, paramazt.c);
/*  66 */     double d4 = Math.max(this.d, paramazt.d);
/*  67 */     double d5 = Math.max(this.e, paramazt.e);
/*  68 */     double d6 = Math.max(this.f, paramazt.f);
/*     */     
/*  70 */     return a(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public azt c(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  74 */     return a(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3, this.d + paramDouble1, this.e + paramDouble2, this.f + paramDouble3);
/*     */   }
/*     */   
/*     */   public double a(azt paramazt, double paramDouble) {
/*  78 */     if ((paramazt.e <= this.b) || (paramazt.b >= this.e)) return paramDouble;
/*  79 */     if ((paramazt.f <= this.c) || (paramazt.c >= this.f)) return paramDouble;
/*     */     double d1;
/*  81 */     if ((paramDouble > 0.0D) && (paramazt.d <= this.a)) {
/*  82 */       d1 = this.a - paramazt.d;
/*  83 */       if (d1 < paramDouble) paramDouble = d1;
/*     */     }
/*  85 */     if ((paramDouble < 0.0D) && (paramazt.a >= this.d)) {
/*  86 */       d1 = this.d - paramazt.a;
/*  87 */       if (d1 > paramDouble) { paramDouble = d1;
/*     */       }
/*     */     }
/*  90 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public double b(azt paramazt, double paramDouble) {
/*  94 */     if ((paramazt.d <= this.a) || (paramazt.a >= this.d)) return paramDouble;
/*  95 */     if ((paramazt.f <= this.c) || (paramazt.c >= this.f)) return paramDouble;
/*     */     double d1;
/*  97 */     if ((paramDouble > 0.0D) && (paramazt.e <= this.b)) {
/*  98 */       d1 = this.b - paramazt.e;
/*  99 */       if (d1 < paramDouble) paramDouble = d1;
/*     */     }
/* 101 */     if ((paramDouble < 0.0D) && (paramazt.b >= this.e)) {
/* 102 */       d1 = this.e - paramazt.b;
/* 103 */       if (d1 > paramDouble) { paramDouble = d1;
/*     */       }
/*     */     }
/* 106 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public double c(azt paramazt, double paramDouble) {
/* 110 */     if ((paramazt.d <= this.a) || (paramazt.a >= this.d)) return paramDouble;
/* 111 */     if ((paramazt.e <= this.b) || (paramazt.b >= this.e)) return paramDouble;
/*     */     double d1;
/* 113 */     if ((paramDouble > 0.0D) && (paramazt.f <= this.c)) {
/* 114 */       d1 = this.c - paramazt.f;
/* 115 */       if (d1 < paramDouble) paramDouble = d1;
/*     */     }
/* 117 */     if ((paramDouble < 0.0D) && (paramazt.c >= this.f)) {
/* 118 */       d1 = this.f - paramazt.c;
/* 119 */       if (d1 > paramDouble) { paramDouble = d1;
/*     */       }
/*     */     }
/* 122 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public boolean b(azt paramazt) {
/* 126 */     if ((paramazt.d <= this.a) || (paramazt.a >= this.d)) return false;
/* 127 */     if ((paramazt.e <= this.b) || (paramazt.b >= this.e)) return false;
/* 128 */     if ((paramazt.f <= this.c) || (paramazt.c >= this.f)) return false;
/* 129 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public azt d(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 140 */     this.a += paramDouble1;
/* 141 */     this.b += paramDouble2;
/* 142 */     this.c += paramDouble3;
/* 143 */     this.d += paramDouble1;
/* 144 */     this.e += paramDouble2;
/* 145 */     this.f += paramDouble3;
/* 146 */     return this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(azw paramazw)
/*     */   {
/* 157 */     if ((paramazw.a <= this.a) || (paramazw.a >= this.d)) return false;
/* 158 */     if ((paramazw.b <= this.b) || (paramazw.b >= this.e)) return false;
/* 159 */     if ((paramazw.c <= this.c) || (paramazw.c >= this.f)) return false;
/* 160 */     return true;
/*     */   }
/*     */   
/*     */   public double a() {
/* 164 */     double d1 = this.d - this.a;
/* 165 */     double d2 = this.e - this.b;
/* 166 */     double d3 = this.f - this.c;
/* 167 */     return (d1 + d2 + d3) / 3.0D;
/*     */   }
/*     */   
/*     */   public azt e(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 171 */     double d1 = this.a + paramDouble1;
/* 172 */     double d2 = this.b + paramDouble2;
/* 173 */     double d3 = this.c + paramDouble3;
/* 174 */     double d4 = this.d - paramDouble1;
/* 175 */     double d5 = this.e - paramDouble2;
/* 176 */     double d6 = this.f - paramDouble3;
/*     */     
/* 178 */     return a(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public azt b() {
/* 182 */     return a(this.a, this.b, this.c, this.d, this.e, this.f);
/*     */   }
/*     */   
/*     */   public azu a(azw paramazw1, azw paramazw2) {
/* 186 */     azw localazw1 = paramazw1.b(paramazw2, this.a);
/* 187 */     azw localazw2 = paramazw1.b(paramazw2, this.d);
/*     */     
/* 189 */     azw localazw3 = paramazw1.c(paramazw2, this.b);
/* 190 */     azw localazw4 = paramazw1.c(paramazw2, this.e);
/*     */     
/* 192 */     azw localazw5 = paramazw1.d(paramazw2, this.c);
/* 193 */     azw localazw6 = paramazw1.d(paramazw2, this.f);
/*     */     
/* 195 */     if (!b(localazw1)) localazw1 = null;
/* 196 */     if (!b(localazw2)) localazw2 = null;
/* 197 */     if (!c(localazw3)) localazw3 = null;
/* 198 */     if (!c(localazw4)) localazw4 = null;
/* 199 */     if (!d(localazw5)) localazw5 = null;
/* 200 */     if (!d(localazw6)) { localazw6 = null;
/*     */     }
/* 202 */     azw localazw7 = null;
/*     */     
/* 204 */     if ((localazw1 != null) && ((localazw7 == null) || (paramazw1.e(localazw1) < paramazw1.e(localazw7)))) localazw7 = localazw1;
/* 205 */     if ((localazw2 != null) && ((localazw7 == null) || (paramazw1.e(localazw2) < paramazw1.e(localazw7)))) localazw7 = localazw2;
/* 206 */     if ((localazw3 != null) && ((localazw7 == null) || (paramazw1.e(localazw3) < paramazw1.e(localazw7)))) localazw7 = localazw3;
/* 207 */     if ((localazw4 != null) && ((localazw7 == null) || (paramazw1.e(localazw4) < paramazw1.e(localazw7)))) localazw7 = localazw4;
/* 208 */     if ((localazw5 != null) && ((localazw7 == null) || (paramazw1.e(localazw5) < paramazw1.e(localazw7)))) localazw7 = localazw5;
/* 209 */     if ((localazw6 != null) && ((localazw7 == null) || (paramazw1.e(localazw6) < paramazw1.e(localazw7)))) { localazw7 = localazw6;
/*     */     }
/* 211 */     if (localazw7 == null) { return null;
/*     */     }
/* 213 */     int i = -1;
/*     */     
/* 215 */     if (localazw7 == localazw1) i = 4;
/* 216 */     if (localazw7 == localazw2) i = 5;
/* 217 */     if (localazw7 == localazw3) i = 0;
/* 218 */     if (localazw7 == localazw4) i = 1;
/* 219 */     if (localazw7 == localazw5) i = 2;
/* 220 */     if (localazw7 == localazw6) { i = 3;
/*     */     }
/* 222 */     return new azu(0, 0, 0, i, localazw7);
/*     */   }
/*     */   
/*     */   private boolean b(azw paramazw) {
/* 226 */     if (paramazw == null) return false;
/* 227 */     return (paramazw.b >= this.b) && (paramazw.b <= this.e) && (paramazw.c >= this.c) && (paramazw.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean c(azw paramazw) {
/* 231 */     if (paramazw == null) return false;
/* 232 */     return (paramazw.a >= this.a) && (paramazw.a <= this.d) && (paramazw.c >= this.c) && (paramazw.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean d(azw paramazw) {
/* 236 */     if (paramazw == null) return false;
/* 237 */     return (paramazw.a >= this.a) && (paramazw.a <= this.d) && (paramazw.b >= this.b) && (paramazw.b <= this.e);
/*     */   }
/*     */   
/*     */   public void d(azt paramazt) {
/* 241 */     this.a = paramazt.a;
/* 242 */     this.b = paramazt.b;
/* 243 */     this.c = paramazt.c;
/* 244 */     this.d = paramazt.d;
/* 245 */     this.e = paramazt.e;
/* 246 */     this.f = paramazt.f;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 250 */     return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */