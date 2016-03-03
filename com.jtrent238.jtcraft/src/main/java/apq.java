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
/*     */ public class apq
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   
/*     */   public apq()
/*     */   {
/*  24 */     super(awt.H);
/*  25 */     a(i);
/*  26 */     c(0.5F);
/*     */   }
/*     */   
/*     */   public void a(rf paramrf) {
/*  30 */     this.a = paramrf;
/*     */   }
/*     */   
/*     */   public void e() {
/*  34 */     this.a = null;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/*  39 */     if (paramyz.bE.d) {
/*  40 */       int i = b(paramInt4);
/*  41 */       aji localaji = paramahb.a(paramInt1 - q.b[i], paramInt2 - q.c[i], paramInt3 - q.d[i]);
/*  42 */       if ((localaji == ajn.J) || (localaji == ajn.F)) {
/*  43 */         paramahb.f(paramInt1 - q.b[i], paramInt2 - q.c[i], paramInt3 - q.d[i]);
/*     */       }
/*     */     }
/*  46 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramyz);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/*  51 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*  52 */     int i = q.a[b(paramInt4)];
/*  53 */     paramInt1 += q.b[i];
/*  54 */     paramInt2 += q.c[i];
/*  55 */     paramInt3 += q.d[i];
/*     */     
/*  57 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  58 */     if ((localaji == ajn.J) || (localaji == ajn.F)) {
/*  59 */       paramInt4 = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  60 */       if (app.c(paramInt4)) {
/*  61 */         localaji.b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, 0);
/*  62 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  70 */     int i = b(paramInt2);
/*     */     
/*  72 */     if (paramInt1 == i) {
/*  73 */       if (this.a != null) {
/*  74 */         return this.a;
/*     */       }
/*  76 */       if ((paramInt2 & 0x8) != 0) {
/*  77 */         return app.e("piston_top_sticky");
/*     */       }
/*  79 */       return app.e("piston_top_normal");
/*     */     }
/*  81 */     if ((i < 6) && (paramInt1 == q.a[i])) {
/*  82 */       return app.e("piston_top_normal");
/*     */     }
/*  84 */     return app.e("piston_side");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(rg paramrg) {}
/*     */   
/*     */ 
/*     */   public int b()
/*     */   {
/*  94 */     return 17;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  99 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 104 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 109 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 114 */     return false;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 119 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/* 124 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 126 */     float f1 = 0.25F;
/* 127 */     float f2 = 0.375F;
/* 128 */     float f3 = 0.625F;
/* 129 */     float f4 = 0.25F;
/* 130 */     float f5 = 0.75F;
/*     */     
/* 132 */     switch (b(i)) {
/*     */     case 0: 
/* 134 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
/* 135 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 136 */       a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
/* 137 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 138 */       break;
/*     */     case 1: 
/* 140 */       a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 141 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 142 */       a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
/* 143 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 144 */       break;
/*     */     case 2: 
/* 146 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
/* 147 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 148 */       a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
/* 149 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 150 */       break;
/*     */     case 3: 
/* 152 */       a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
/* 153 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 154 */       a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
/* 155 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 156 */       break;
/*     */     case 4: 
/* 158 */       a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
/* 159 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 160 */       a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
/* 161 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 162 */       break;
/*     */     case 5: 
/* 164 */       a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 165 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/* 166 */       a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
/* 167 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*     */     
/* 170 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 175 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 177 */     float f = 0.25F;
/*     */     
/* 179 */     switch (b(i)) {
/*     */     case 0: 
/* 181 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
/* 182 */       break;
/*     */     case 1: 
/* 184 */       a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 185 */       break;
/*     */     case 2: 
/* 187 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
/* 188 */       break;
/*     */     case 3: 
/* 190 */       a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
/* 191 */       break;
/*     */     case 4: 
/* 193 */       a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
/* 194 */       break;
/*     */     case 5: 
/* 196 */       a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 203 */     int i = b(paramahb.e(paramInt1, paramInt2, paramInt3));
/* 204 */     aji localaji = paramahb.a(paramInt1 - q.b[i], paramInt2 - q.c[i], paramInt3 - q.d[i]);
/* 205 */     if ((localaji != ajn.J) && (localaji != ajn.F)) {
/* 206 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 208 */       localaji.a(paramahb, paramInt1 - q.b[i], paramInt2 - q.c[i], paramInt3 - q.d[i], paramaji);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 213 */     return qh.a(paramInt & 0x7, 0, q.b.length - 1);
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 218 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 219 */     if ((i & 0x8) != 0) {
/* 220 */       return adb.a(ajn.F);
/*     */     }
/* 222 */     return adb.a(ajn.J);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */