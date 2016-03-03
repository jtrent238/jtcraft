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
/*     */ public class ale
/*     */   extends ajc
/*     */ {
/*  22 */   private final Random a = new Random();
/*     */   private final boolean b;
/*     */   private static boolean M;
/*     */   private rf N;
/*     */   private rf O;
/*     */   
/*     */   protected ale(boolean paramBoolean) {
/*  29 */     super(awt.e);
/*  30 */     this.b = paramBoolean;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  35 */     return adb.a(ajn.al);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  41 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     if (paramahb.E) {
/*  47 */       return;
/*     */     }
/*     */     
/*  50 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/*  51 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/*  52 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/*  53 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  55 */     int i = 3;
/*  56 */     if ((localaji1.j()) && (!localaji2.j())) i = 3;
/*  57 */     if ((localaji2.j()) && (!localaji1.j())) i = 2;
/*  58 */     if ((localaji3.j()) && (!localaji4.j())) i = 5;
/*  59 */     if ((localaji4.j()) && (!localaji3.j())) i = 4;
/*  60 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  65 */     if (paramInt1 == 1) return this.N;
/*  66 */     if (paramInt1 == 0) { return this.N;
/*     */     }
/*  68 */     if (paramInt1 != paramInt2) return this.L;
/*  69 */     return this.O;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  74 */     this.L = paramrg.a("furnace_side");
/*  75 */     this.O = paramrg.a(this.b ? "furnace_front_on" : "furnace_front_off");
/*  76 */     this.N = paramrg.a("furnace_top");
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  81 */     if (!this.b) { return;
/*     */     }
/*  83 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  85 */     float f1 = paramInt1 + 0.5F;
/*  86 */     float f2 = paramInt2 + 0.0F + paramRandom.nextFloat() * 6.0F / 16.0F;
/*  87 */     float f3 = paramInt3 + 0.5F;
/*  88 */     float f4 = 0.52F;
/*  89 */     float f5 = paramRandom.nextFloat() * 0.6F - 0.3F;
/*     */     
/*  91 */     if (i == 4) {
/*  92 */       paramahb.a("smoke", f1 - f4, f2, f3 + f5, 0.0D, 0.0D, 0.0D);
/*  93 */       paramahb.a("flame", f1 - f4, f2, f3 + f5, 0.0D, 0.0D, 0.0D);
/*  94 */     } else if (i == 5) {
/*  95 */       paramahb.a("smoke", f1 + f4, f2, f3 + f5, 0.0D, 0.0D, 0.0D);
/*  96 */       paramahb.a("flame", f1 + f4, f2, f3 + f5, 0.0D, 0.0D, 0.0D);
/*  97 */     } else if (i == 2) {
/*  98 */       paramahb.a("smoke", f1 + f5, f2, f3 - f4, 0.0D, 0.0D, 0.0D);
/*  99 */       paramahb.a("flame", f1 + f5, f2, f3 - f4, 0.0D, 0.0D, 0.0D);
/* 100 */     } else if (i == 3) {
/* 101 */       paramahb.a("smoke", f1 + f5, f2, f3 + f4, 0.0D, 0.0D, 0.0D);
/* 102 */       paramahb.a("flame", f1 + f5, f2, f3 + f4, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 108 */     if (paramahb.E) {
/* 109 */       return true;
/*     */     }
/* 111 */     apg localapg = (apg)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 112 */     if (localapg != null) paramyz.a(localapg);
/* 113 */     return true;
/*     */   }
/*     */   
/*     */   public static void a(boolean paramBoolean, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 117 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 118 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/*     */     
/* 120 */     M = true;
/* 121 */     if (paramBoolean) paramahb.b(paramInt1, paramInt2, paramInt3, ajn.am); else
/* 122 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.al);
/* 123 */     M = false;
/*     */     
/* 125 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */     
/* 127 */     if (localaor != null) {
/* 128 */       localaor.t();
/* 129 */       paramahb.a(paramInt1, paramInt2, paramInt3, localaor);
/*     */     }
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/* 135 */     return new apg();
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 140 */     int i = qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3;
/*     */     
/* 142 */     if (i == 0) paramahb.a(paramInt1, paramInt2, paramInt3, 2, 2);
/* 143 */     if (i == 1) paramahb.a(paramInt1, paramInt2, paramInt3, 5, 2);
/* 144 */     if (i == 2) paramahb.a(paramInt1, paramInt2, paramInt3, 3, 2);
/* 145 */     if (i == 3) { paramahb.a(paramInt1, paramInt2, paramInt3, 4, 2);
/*     */     }
/* 147 */     if (paramadd.u()) {
/* 148 */       ((apg)paramahb.o(paramInt1, paramInt2, paramInt3)).a(paramadd.s());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 154 */     if (!M) {
/* 155 */       apg localapg = (apg)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 156 */       if (localapg != null) {
/* 157 */         for (int i = 0; i < localapg.a(); i++) {
/* 158 */           add localadd = localapg.a(i);
/* 159 */           if (localadd != null) {
/* 160 */             float f1 = this.a.nextFloat() * 0.8F + 0.1F;
/* 161 */             float f2 = this.a.nextFloat() * 0.8F + 0.1F;
/* 162 */             float f3 = this.a.nextFloat() * 0.8F + 0.1F;
/*     */             
/* 164 */             while (localadd.b > 0) {
/* 165 */               int j = this.a.nextInt(21) + 10;
/* 166 */               if (j > localadd.b) j = localadd.b;
/* 167 */               localadd.b -= j;
/*     */               
/* 169 */               xk localxk = new xk(paramahb, paramInt1 + f1, paramInt2 + f2, paramInt3 + f3, new add(localadd.b(), j, localadd.k()));
/*     */               
/* 171 */               if (localadd.p()) {
/* 172 */                 localxk.f().d((dh)localadd.q().b());
/*     */               }
/*     */               
/* 175 */               float f4 = 0.05F;
/* 176 */               localxk.v = ((float)this.a.nextGaussian() * f4);
/* 177 */               localxk.w = ((float)this.a.nextGaussian() * f4 + 0.2F);
/* 178 */               localxk.x = ((float)this.a.nextGaussian() * f4);
/* 179 */               paramahb.d(localxk);
/*     */             }
/*     */           }
/*     */         }
/* 183 */         paramahb.f(paramInt1, paramInt2, paramInt3, paramaji);
/*     */       }
/*     */     }
/* 186 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 191 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 196 */     return zs.b((rb)paramahb.o(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 201 */     return adb.a(ajn.al);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */