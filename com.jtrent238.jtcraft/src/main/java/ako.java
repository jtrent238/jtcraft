/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class ako
/*     */   extends ajr
/*     */   implements ajo
/*     */ {
/*  29 */   public static final String[] a = { "sunflower", "syringa", "grass", "fern", "rose", "paeonia" };
/*     */   
/*     */   private rf[] M;
/*     */   
/*     */   private rf[] N;
/*     */   
/*     */   public rf[] b;
/*     */   
/*     */   public ako()
/*     */   {
/*  39 */     super(awt.k);
/*     */     
/*  41 */     c(0.0F);
/*  42 */     a(h);
/*  43 */     c("doublePlant");
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  48 */     return 40;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public int e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  57 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  58 */     if (!c(i)) {
/*  59 */       return i & 0x7;
/*     */     }
/*  61 */     return paramahl.e(paramInt1, paramInt2 - 1, paramInt3) & 0x7;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  80 */     return (super.c(paramahb, paramInt1, paramInt2, paramInt3)) && (paramahb.c(paramInt1, paramInt2 + 1, paramInt3));
/*     */   }
/*     */   
/*     */   protected void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  85 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  86 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  87 */       if (!c(i)) {
/*  88 */         b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/*  89 */         if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) == this) {
/*  90 */           paramahb.d(paramInt1, paramInt2 + 1, paramInt3, ajn.a, 0, 2);
/*     */         }
/*     */       }
/*  93 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.a, 0, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  99 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 100 */     if (c(i)) {
/* 101 */       return paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == this;
/*     */     }
/* 103 */     return (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) == this) && (super.j(paramahb, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 108 */     if (c(paramInt1)) {
/* 109 */       return null;
/*     */     }
/* 111 */     int i = d(paramInt1);
/* 112 */     if ((i == 3) || (i == 2))
/*     */     {
/* 114 */       return null;
/*     */     }
/* 116 */     return adb.a(this);
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/* 121 */     if (c(paramInt)) {
/* 122 */       return 0;
/*     */     }
/* 124 */     return paramInt & 0x7;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean c(int paramInt)
/*     */   {
/* 132 */     return (paramInt & 0x8) != 0;
/*     */   }
/*     */   
/*     */   public static int d(int paramInt) {
/* 136 */     return paramInt & 0x7;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 141 */     if (c(paramInt2)) {
/* 142 */       return this.M[0];
/*     */     }
/* 144 */     return this.M[(paramInt2 & 0x7)];
/*     */   }
/*     */   
/*     */   public rf a(boolean paramBoolean, int paramInt) {
/* 148 */     if (paramBoolean) {
/* 149 */       return this.N[paramInt];
/*     */     }
/* 151 */     return this.M[paramInt];
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 156 */     int i = e(paramahl, paramInt1, paramInt2, paramInt3);
/* 157 */     if ((i == 2) || (i == 3)) {
/* 158 */       return paramahl.a(paramInt1, paramInt3).b(paramInt1, paramInt2, paramInt3);
/*     */     }
/* 160 */     return 16777215;
/*     */   }
/*     */   
/*     */   public void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 164 */     paramahb.d(paramInt1, paramInt2, paramInt3, this, paramInt4, paramInt5);
/* 165 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this, 8, paramInt5);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 170 */     int i = ((qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3) + 2) % 4;
/* 171 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this, 0x8 | i, 2);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 176 */     if ((!paramahb.E) && (paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ))
/*     */     {
/*     */ 
/*     */ 
/* 180 */       if ((!c(paramInt4)) && 
/* 181 */         (b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramyz))) {
/* 182 */         return;
/*     */       }
/*     */     }
/*     */     
/* 186 */     super.a(paramahb, paramyz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/* 191 */     if (c(paramInt4)) {
/* 192 */       if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == this) {
/* 193 */         if (!paramyz.bE.d)
/*     */         {
/* 195 */           int i = paramahb.e(paramInt1, paramInt2 - 1, paramInt3);
/* 196 */           int j = d(i);
/* 197 */           if ((j == 3) || (j == 2)) {
/* 198 */             if ((!paramahb.E) && (paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ)) {
/* 199 */               b(paramahb, paramInt1, paramInt2, paramInt3, i, paramyz);
/*     */             }
/* 201 */             paramahb.f(paramInt1, paramInt2 - 1, paramInt3);
/*     */           } else {
/* 203 */             paramahb.a(paramInt1, paramInt2 - 1, paramInt3, true);
/*     */           }
/*     */         } else {
/* 206 */           paramahb.f(paramInt1, paramInt2 - 1, paramInt3);
/*     */         }
/*     */       }
/*     */     }
/* 210 */     else if ((paramyz.bE.d) && (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) == this))
/*     */     {
/* 212 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, ajn.a, 0, 2);
/*     */     }
/*     */     
/* 215 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramyz);
/*     */   }
/*     */   
/*     */   private boolean b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz) {
/* 219 */     int i = d(paramInt4);
/* 220 */     if ((i == 3) || (i == 2)) {
/* 221 */       paramyz.a(pp.C[aji.b(this)], 1);
/* 222 */       int j = 1;
/* 223 */       if (i == 3) {
/* 224 */         j = 2;
/*     */       }
/*     */       
/* 227 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ajn.H, 2, j));
/* 228 */       return true;
/*     */     }
/* 230 */     return false;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 235 */     this.M = new rf[a.length];
/* 236 */     this.N = new rf[a.length];
/*     */     
/* 238 */     for (int i = 0; i < this.M.length; i++) {
/* 239 */       this.M[i] = paramrg.a("double_plant_" + a[i] + "_bottom");
/* 240 */       this.N[i] = paramrg.a("double_plant_" + a[i] + "_top");
/*     */     }
/*     */     
/* 243 */     this.b = new rf[2];
/* 244 */     this.b[0] = paramrg.a("double_plant_sunflower_front");
/* 245 */     this.b[1] = paramrg.a("double_plant_sunflower_back");
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 250 */     for (int i = 0; i < this.M.length; i++) {
/* 251 */       paramList.add(new add(paramadb, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 257 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 258 */     if (c(i)) {
/* 259 */       return d(paramahb.e(paramInt1, paramInt2 - 1, paramInt3));
/*     */     }
/* 261 */     return d(i);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 266 */     int i = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 267 */     if ((i == 2) || (i == 3)) {
/* 268 */       return false;
/*     */     }
/* 270 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 275 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 280 */     int i = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 281 */     a(paramahb, paramInt1, paramInt2, paramInt3, new add(this, 1, i));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ako.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */