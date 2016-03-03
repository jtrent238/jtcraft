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
/*     */ public class ajw
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   private rf b;
/*     */   private rf M;
/*     */   
/*     */   public ajw()
/*     */   {
/*  33 */     super(awt.f);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     if (paramInt1 == 1) {
/*  39 */       return this.b;
/*     */     }
/*  41 */     if (paramInt1 == 0) {
/*  42 */       return this.M;
/*     */     }
/*  44 */     return this.L;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  49 */     this.a = paramrg.a(N() + "_" + "inner");
/*  50 */     this.b = paramrg.a(N() + "_top");
/*  51 */     this.M = paramrg.a(N() + "_" + "bottom");
/*  52 */     this.L = paramrg.a(N() + "_side");
/*     */   }
/*     */   
/*     */   public static rf e(String paramString) {
/*  56 */     if (paramString.equals("inner")) return ajn.bp.a;
/*  57 */     if (paramString.equals("bottom")) return ajn.bp.M;
/*  58 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  63 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
/*  64 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  65 */     float f = 0.125F;
/*  66 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  67 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  68 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  69 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  70 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  71 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  72 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  73 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     
/*  75 */     g();
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  80 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  85 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  90 */     return 24;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  95 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/* 100 */     int i = b(paramahb.e(paramInt1, paramInt2, paramInt3));
/* 101 */     float f = paramInt2 + (6.0F + 3 * i) / 16.0F;
/*     */     
/* 103 */     if ((!paramahb.E) && (paramsa.al()) && (i > 0) && (paramsa.C.b <= f)) {
/* 104 */       paramsa.F();
/*     */       
/* 106 */       a(paramahb, paramInt1, paramInt2, paramInt3, i - 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 112 */     if (paramahb.E) {
/* 113 */       return true;
/*     */     }
/*     */     
/* 116 */     add localadd = paramyz.bm.h();
/* 117 */     if (localadd == null) {
/* 118 */       return true;
/*     */     }
/*     */     
/* 121 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 122 */     int j = b(i);
/*     */     
/* 124 */     if (localadd.b() == ade.as) {
/* 125 */       if (j < 3) {
/* 126 */         if (!paramyz.bE.d) {
/* 127 */           paramyz.bm.a(paramyz.bm.c, new add(ade.ar));
/*     */         }
/*     */         
/* 130 */         a(paramahb, paramInt1, paramInt2, paramInt3, 3);
/*     */       }
/* 132 */       return true; }
/* 133 */     Object localObject; if (localadd.b() == ade.bo) {
/* 134 */       if (j > 0) {
/* 135 */         if (!paramyz.bE.d) {
/* 136 */           localObject = new add(ade.bn, 1, 0);
/* 137 */           if (!paramyz.bm.a((add)localObject)) {
/* 138 */             paramahb.d(new xk(paramahb, paramInt1 + 0.5D, paramInt2 + 1.5D, paramInt3 + 0.5D, (add)localObject));
/* 139 */           } else if ((paramyz instanceof mw)) {
/* 140 */             ((mw)paramyz).a(paramyz.bn);
/*     */           }
/*     */           
/* 143 */           localadd.b -= 1;
/* 144 */           if (localadd.b <= 0) {
/* 145 */             paramyz.bm.a(paramyz.bm.c, null);
/*     */           }
/*     */         }
/*     */         
/* 149 */         a(paramahb, paramInt1, paramInt2, paramInt3, j - 1);
/*     */       }
/* 151 */     } else if ((j > 0) && ((localadd.b() instanceof abb)) && (((abb)localadd.b()).m_() == abd.a)) {
/* 152 */       localObject = (abb)localadd.b();
/* 153 */       ((abb)localObject).c(localadd);
/* 154 */       a(paramahb, paramInt1, paramInt2, paramInt3, j - 1);
/* 155 */       return true;
/*     */     }
/*     */     
/* 158 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 162 */     paramahb.a(paramInt1, paramInt2, paramInt3, qh.a(paramInt4, 0, 3), 2);
/* 163 */     paramahb.f(paramInt1, paramInt2, paramInt3, this);
/*     */   }
/*     */   
/*     */   public void l(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 168 */     if (paramahb.s.nextInt(20) != 1) { return;
/*     */     }
/* 170 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 172 */     if (i < 3) {
/* 173 */       paramahb.a(paramInt1, paramInt2, paramInt3, i + 1, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 179 */     return ade.bu;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 184 */     return ade.bu;
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 189 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 194 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 196 */     return b(i);
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 200 */     return paramInt;
/*     */   }
/*     */   
/*     */   public static float c(int paramInt) {
/* 204 */     int i = qh.a(paramInt, 0, 3);
/* 205 */     return (6 + 3 * i) / 16.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */