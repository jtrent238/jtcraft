/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ana
/*     */   extends aji
/*     */ {
/*  20 */   private boolean a = true;
/*  21 */   private Set b = new HashSet();
/*     */   private rf M;
/*     */   private rf N;
/*     */   private rf O;
/*     */   private rf P;
/*     */   
/*     */   public ana() {
/*  28 */     super(awt.q);
/*  29 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  34 */     return null;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  39 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  49 */     return 5;
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  54 */     return 8388608;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  59 */     return (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) || (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.aN);
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  63 */     a(paramahb, paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*  64 */     ArrayList localArrayList = new ArrayList(this.b);
/*  65 */     this.b.clear();
/*  66 */     for (int i = 0; i < localArrayList.size(); i++) {
/*  67 */       agt localagt = (agt)localArrayList.get(i);
/*  68 */       paramahb.d(localagt.a, localagt.b, localagt.c, this);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  73 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  74 */     int j = 0;
/*     */     
/*  76 */     j = a(paramahb, paramInt4, paramInt5, paramInt6, j);
/*     */     
/*  78 */     this.a = false;
/*  79 */     int k = paramahb.w(paramInt1, paramInt2, paramInt3);
/*  80 */     this.a = true;
/*     */     
/*  82 */     if ((k > 0) && (k > j - 1)) {
/*  83 */       j = k;
/*     */     }
/*     */     
/*  86 */     int m = 0;
/*  87 */     for (int n = 0; n < 4; n++) {
/*  88 */       int i1 = paramInt1;
/*  89 */       int i2 = paramInt3;
/*  90 */       if (n == 0) i1--;
/*  91 */       if (n == 1) i1++;
/*  92 */       if (n == 2) i2--;
/*  93 */       if (n == 3) { i2++;
/*     */       }
/*  95 */       if ((i1 != paramInt4) || (i2 != paramInt6)) m = a(paramahb, i1, paramInt2, i2, m);
/*  96 */       if ((paramahb.a(i1, paramInt2, i2).r()) && (!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r())) {
/*  97 */         if (((i1 != paramInt4) || (i2 != paramInt6)) && (paramInt2 >= paramInt5))
/*  98 */           m = a(paramahb, i1, paramInt2 + 1, i2, m);
/*  99 */       } else if ((!paramahb.a(i1, paramInt2, i2).r()) && 
/* 100 */         ((i1 != paramInt4) || (i2 != paramInt6)) && (paramInt2 <= paramInt5)) {
/* 101 */         m = a(paramahb, i1, paramInt2 - 1, i2, m);
/*     */       }
/*     */     }
/* 104 */     if (m > j) { j = m - 1;
/* 105 */     } else if (j > 0) j--; else {
/* 106 */       j = 0;
/*     */     }
/* 108 */     if (k > j - 1) {
/* 109 */       j = k;
/*     */     }
/*     */     
/*     */ 
/* 113 */     if (i != j)
/*     */     {
/* 115 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 2);
/*     */       
/*     */ 
/* 118 */       this.b.add(new agt(paramInt1, paramInt2, paramInt3));
/* 119 */       this.b.add(new agt(paramInt1 - 1, paramInt2, paramInt3));
/* 120 */       this.b.add(new agt(paramInt1 + 1, paramInt2, paramInt3));
/* 121 */       this.b.add(new agt(paramInt1, paramInt2 - 1, paramInt3));
/* 122 */       this.b.add(new agt(paramInt1, paramInt2 + 1, paramInt3));
/* 123 */       this.b.add(new agt(paramInt1, paramInt2, paramInt3 - 1));
/* 124 */       this.b.add(new agt(paramInt1, paramInt2, paramInt3 + 1));
/*     */     }
/*     */   }
/*     */   
/*     */   private void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 130 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) { return;
/*     */     }
/* 132 */     paramahb.d(paramInt1, paramInt2, paramInt3, this);
/* 133 */     paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 134 */     paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 135 */     paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 136 */     paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/*     */     
/* 138 */     paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 139 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 144 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/* 145 */     if (paramahb.E) { return;
/*     */     }
/* 147 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/* 148 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/* 149 */     paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*     */     
/* 151 */     m(paramahb, paramInt1 - 1, paramInt2, paramInt3);
/* 152 */     m(paramahb, paramInt1 + 1, paramInt2, paramInt3);
/* 153 */     m(paramahb, paramInt1, paramInt2, paramInt3 - 1);
/* 154 */     m(paramahb, paramInt1, paramInt2, paramInt3 + 1);
/*     */     
/* 156 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r()) m(paramahb, paramInt1 - 1, paramInt2 + 1, paramInt3); else
/* 157 */       m(paramahb, paramInt1 - 1, paramInt2 - 1, paramInt3);
/* 158 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r()) m(paramahb, paramInt1 + 1, paramInt2 + 1, paramInt3); else
/* 159 */       m(paramahb, paramInt1 + 1, paramInt2 - 1, paramInt3);
/* 160 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r()) m(paramahb, paramInt1, paramInt2 + 1, paramInt3 - 1); else
/* 161 */       m(paramahb, paramInt1, paramInt2 - 1, paramInt3 - 1);
/* 162 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) m(paramahb, paramInt1, paramInt2 + 1, paramInt3 + 1); else {
/* 163 */       m(paramahb, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {
/* 168 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/* 169 */     if (paramahb.E) { return;
/*     */     }
/* 171 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/* 172 */     paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 173 */     paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 174 */     paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 175 */     paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/* 176 */     paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 177 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/* 179 */     m(paramahb, paramInt1 - 1, paramInt2, paramInt3);
/* 180 */     m(paramahb, paramInt1 + 1, paramInt2, paramInt3);
/* 181 */     m(paramahb, paramInt1, paramInt2, paramInt3 - 1);
/* 182 */     m(paramahb, paramInt1, paramInt2, paramInt3 + 1);
/*     */     
/* 184 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r()) m(paramahb, paramInt1 - 1, paramInt2 + 1, paramInt3); else
/* 185 */       m(paramahb, paramInt1 - 1, paramInt2 - 1, paramInt3);
/* 186 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r()) m(paramahb, paramInt1 + 1, paramInt2 + 1, paramInt3); else
/* 187 */       m(paramahb, paramInt1 + 1, paramInt2 - 1, paramInt3);
/* 188 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r()) m(paramahb, paramInt1, paramInt2 + 1, paramInt3 - 1); else
/* 189 */       m(paramahb, paramInt1, paramInt2 - 1, paramInt3 - 1);
/* 190 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) m(paramahb, paramInt1, paramInt2 + 1, paramInt3 + 1); else
/* 191 */       m(paramahb, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*     */   }
/*     */   
/*     */   private int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 195 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) return paramInt4;
/* 196 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 197 */     if (i > paramInt4) return i;
/* 198 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 203 */     if (paramahb.E) { return;
/*     */     }
/* 205 */     boolean bool = c(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/* 207 */     if (bool) {
/* 208 */       e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 210 */       b(paramahb, paramInt1, paramInt2, paramInt3, 0, 0);
/* 211 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 214 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 219 */     return ade.ax;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 224 */     if (!this.a) return 0;
/* 225 */     return b(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 230 */     if (!this.a) return 0;
/* 231 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 232 */     if (i == 0) {
/* 233 */       return 0;
/*     */     }
/*     */     
/* 236 */     if (paramInt4 == 1) { return i;
/*     */     }
/* 238 */     int j = (g(paramahl, paramInt1 - 1, paramInt2, paramInt3, 1)) || ((!paramahl.a(paramInt1 - 1, paramInt2, paramInt3).r()) && (g(paramahl, paramInt1 - 1, paramInt2 - 1, paramInt3, -1))) ? 1 : 0;
/*     */     
/* 240 */     int k = (g(paramahl, paramInt1 + 1, paramInt2, paramInt3, 3)) || ((!paramahl.a(paramInt1 + 1, paramInt2, paramInt3).r()) && (g(paramahl, paramInt1 + 1, paramInt2 - 1, paramInt3, -1))) ? 1 : 0;
/*     */     
/* 242 */     int m = (g(paramahl, paramInt1, paramInt2, paramInt3 - 1, 2)) || ((!paramahl.a(paramInt1, paramInt2, paramInt3 - 1).r()) && (g(paramahl, paramInt1, paramInt2 - 1, paramInt3 - 1, -1))) ? 1 : 0;
/*     */     
/* 244 */     int n = (g(paramahl, paramInt1, paramInt2, paramInt3 + 1, 0)) || ((!paramahl.a(paramInt1, paramInt2, paramInt3 + 1).r()) && (g(paramahl, paramInt1, paramInt2 - 1, paramInt3 + 1, -1))) ? 1 : 0;
/*     */     
/*     */ 
/* 247 */     if (!paramahl.a(paramInt1, paramInt2 + 1, paramInt3).r()) {
/* 248 */       if ((paramahl.a(paramInt1 - 1, paramInt2, paramInt3).r()) && (g(paramahl, paramInt1 - 1, paramInt2 + 1, paramInt3, -1))) j = 1;
/* 249 */       if ((paramahl.a(paramInt1 + 1, paramInt2, paramInt3).r()) && (g(paramahl, paramInt1 + 1, paramInt2 + 1, paramInt3, -1))) k = 1;
/* 250 */       if ((paramahl.a(paramInt1, paramInt2, paramInt3 - 1).r()) && (g(paramahl, paramInt1, paramInt2 + 1, paramInt3 - 1, -1))) m = 1;
/* 251 */       if ((paramahl.a(paramInt1, paramInt2, paramInt3 + 1).r()) && (g(paramahl, paramInt1, paramInt2 + 1, paramInt3 + 1, -1))) { n = 1;
/*     */       }
/*     */     }
/* 254 */     if ((m == 0) && (k == 0) && (j == 0) && (n == 0) && (paramInt4 >= 2) && (paramInt4 <= 5)) { return i;
/*     */     }
/* 256 */     if ((paramInt4 == 2) && (m != 0) && (j == 0) && (k == 0)) return i;
/* 257 */     if ((paramInt4 == 3) && (n != 0) && (j == 0) && (k == 0)) return i;
/* 258 */     if ((paramInt4 == 4) && (j != 0) && (m == 0) && (n == 0)) return i;
/* 259 */     if ((paramInt4 == 5) && (k != 0) && (m == 0) && (n == 0)) { return i;
/*     */     }
/* 261 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 266 */     return this.a;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 271 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 272 */     if (i > 0) {
/* 273 */       double d1 = paramInt1 + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 274 */       double d2 = paramInt2 + 0.0625F;
/* 275 */       double d3 = paramInt3 + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/*     */       
/*     */ 
/* 278 */       float f1 = i / 15.0F;
/* 279 */       float f2 = f1 * 0.6F + 0.4F;
/* 280 */       if (i == 0) { f2 = 0.0F;
/*     */       }
/* 282 */       float f3 = f1 * f1 * 0.7F - 0.5F;
/* 283 */       float f4 = f1 * f1 * 0.6F - 0.7F;
/* 284 */       if (f3 < 0.0F) f3 = 0.0F;
/* 285 */       if (f4 < 0.0F) { f4 = 0.0F;
/*     */       }
/* 287 */       paramahb.a("reddust", d1, d2, d3, f2, f3, f4);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 292 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 293 */     if (localaji == ajn.af) return true;
/* 294 */     if (ajn.aR.e(localaji)) {
/* 295 */       int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 296 */       return (paramInt4 == (i & 0x3)) || (paramInt4 == p.f[(i & 0x3)]); }
/* 297 */     if ((localaji.f()) && (paramInt4 != -1)) return true;
/* 298 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean g(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 302 */     if (f(paramahl, paramInt1, paramInt2, paramInt3, paramInt4)) {
/* 303 */       return true;
/*     */     }
/*     */     
/* 306 */     if (paramahl.a(paramInt1, paramInt2, paramInt3) == ajn.aS) {
/* 307 */       int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 308 */       return paramInt4 == (i & 0x3);
/*     */     }
/* 310 */     return false;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 315 */     return ade.ax;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 320 */     this.M = paramrg.a(N() + "_" + "cross");
/* 321 */     this.N = paramrg.a(N() + "_" + "line");
/* 322 */     this.O = paramrg.a(N() + "_" + "cross_overlay");
/* 323 */     this.P = paramrg.a(N() + "_" + "line_overlay");
/*     */     
/* 325 */     this.L = this.M;
/*     */   }
/*     */   
/*     */   public static rf e(String paramString) {
/* 329 */     if (paramString.equals("cross")) return ajn.af.M;
/* 330 */     if (paramString.equals("line")) return ajn.af.N;
/* 331 */     if (paramString.equals("cross_overlay")) return ajn.af.O;
/* 332 */     if (paramString.equals("line_overlay")) return ajn.af.P;
/* 333 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ana.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */