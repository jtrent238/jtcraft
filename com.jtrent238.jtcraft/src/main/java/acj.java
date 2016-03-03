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
/*     */ public class acj
/*     */   extends adb
/*     */ {
/*  15 */   public static final String[] a = { "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white" };
/*     */   
/*     */ 
/*  18 */   public static final String[] b = { "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white" };
/*     */   
/*     */ 
/*     */ 
/*  22 */   public static final int[] c = { 1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
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
/*     */   private rf[] d;
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
/*     */   public acj()
/*     */   {
/*  46 */     a(true);
/*  47 */     f(0);
/*  48 */     a(abt.l);
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt)
/*     */   {
/*  53 */     int i = qh.a(paramInt, 0, 15);
/*  54 */     return this.d[i];
/*     */   }
/*     */   
/*     */   public String a(add paramadd)
/*     */   {
/*  59 */     int i = qh.a(paramadd.k(), 0, 15);
/*  60 */     return super.a() + "." + a[i];
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  65 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*     */     }
/*  67 */     if (paramadd.k() == 15)
/*     */     {
/*     */ 
/*  70 */       if (a(paramadd, paramahb, paramInt1, paramInt2, paramInt3)) {
/*  71 */         if (!paramahb.E) paramahb.c(2005, paramInt1, paramInt2, paramInt3, 0);
/*  72 */         return true;
/*     */       }
/*  74 */     } else if (paramadd.k() == 3)
/*     */     {
/*     */ 
/*  77 */       aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  78 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */       
/*  80 */       if ((localaji == ajn.r) && (alx.c(i) == 3)) {
/*  81 */         if (paramInt4 == 0) return false;
/*  82 */         if (paramInt4 == 1) return false;
/*  83 */         if (paramInt4 == 2) paramInt3--;
/*  84 */         if (paramInt4 == 3) paramInt3++;
/*  85 */         if (paramInt4 == 4) paramInt1--;
/*  86 */         if (paramInt4 == 5) { paramInt1++;
/*     */         }
/*  88 */         if (paramahb.c(paramInt1, paramInt2, paramInt3)) {
/*  89 */           int j = ajn.by.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, 0);
/*  90 */           paramahb.d(paramInt1, paramInt2, paramInt3, ajn.by, j, 2);
/*  91 */           if (!paramyz.bE.d) {
/*  92 */             paramadd.b -= 1;
/*     */           }
/*     */         }
/*  95 */         return true;
/*     */       }
/*     */     }
/*     */     
/*  99 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(add paramadd, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 103 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*     */     
/* 105 */     if ((localaji instanceof ajo)) {
/* 106 */       ajo localajo = (ajo)localaji;
/*     */       
/* 108 */       if (localajo.a(paramahb, paramInt1, paramInt2, paramInt3, paramahb.E)) {
/* 109 */         if (!paramahb.E) {
/* 110 */           if (localajo.a(paramahb, paramahb.s, paramInt1, paramInt2, paramInt3)) {
/* 111 */             localajo.b(paramahb, paramahb.s, paramInt1, paramInt2, paramInt3);
/*     */           }
/* 113 */           paramadd.b -= 1;
/*     */         }
/* 115 */         return true;
/*     */       }
/*     */     }
/* 118 */     return false;
/*     */   }
/*     */   
/*     */   public static void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 122 */     if (paramInt4 == 0) { paramInt4 = 15;
/*     */     }
/* 124 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 125 */     if (localaji.o() == awt.a) return;
/* 126 */     localaji.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/* 128 */     for (int i = 0; i < paramInt4; i++) {
/* 129 */       double d1 = g.nextGaussian() * 0.02D;
/* 130 */       double d2 = g.nextGaussian() * 0.02D;
/* 131 */       double d3 = g.nextGaussian() * 0.02D;
/* 132 */       paramahb.a("happyVillager", paramInt1 + g.nextFloat(), paramInt2 + g.nextFloat() * localaji.A(), paramInt3 + g.nextFloat(), d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, sv paramsv)
/*     */   {
/* 138 */     if ((paramsv instanceof wp)) {
/* 139 */       wp localwp = (wp)paramsv;
/*     */       
/* 141 */       int i = aka.b(paramadd.k());
/* 142 */       if ((!localwp.ca()) && (localwp.bZ() != i)) {
/* 143 */         localwp.s(i);
/* 144 */         paramadd.b -= 1;
/*     */       }
/*     */       
/* 147 */       return true;
/*     */     }
/* 149 */     return false;
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 154 */     for (int i = 0; i < 16; i++) {
/* 155 */       paramList.add(new add(paramadb, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 161 */     this.d = new rf[b.length];
/*     */     
/* 163 */     for (int i = 0; i < b.length; i++) {
/* 164 */       this.d[i] = paramrg.a(w() + "_" + b[i]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */