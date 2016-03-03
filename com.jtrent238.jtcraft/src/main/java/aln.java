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
/*     */ public class aln
/*     */   extends ajc
/*     */ {
/*  26 */   private final Random a = new Random();
/*     */   private rf b;
/*     */   private rf M;
/*     */   private rf N;
/*     */   
/*     */   public aln()
/*     */   {
/*  33 */     super(awt.f);
/*  34 */     a(abt.d);
/*  35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  45 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*  46 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  47 */     float f = 0.125F;
/*  48 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  49 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  50 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  51 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  52 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  53 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  54 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  55 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     
/*  57 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  62 */     int i = q.a[paramInt4];
/*  63 */     if (i == 1) i = 0;
/*  64 */     return i;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  69 */     return new api();
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  74 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramsv, paramadd);
/*     */     
/*  76 */     if (paramadd.u()) {
/*  77 */       api localapi = e(paramahb, paramInt1, paramInt2, paramInt3);
/*  78 */       localapi.a(paramadd.s());
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  84 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  85 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  90 */     if (paramahb.E) {
/*  91 */       return true;
/*     */     }
/*  93 */     api localapi = e(paramahb, paramInt1, paramInt2, paramInt3);
/*  94 */     if (localapi != null) paramyz.a(localapi);
/*  95 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 100 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 104 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 105 */     int j = b(i);
/* 106 */     boolean bool1 = !paramahb.v(paramInt1, paramInt2, paramInt3);
/* 107 */     boolean bool2 = c(i);
/*     */     
/* 109 */     if (bool1 != bool2) {
/* 110 */       paramahb.a(paramInt1, paramInt2, paramInt3, j | (bool1 ? 0 : 8), 4);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 116 */     api localapi = (api)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 117 */     if (localapi != null) {
/* 118 */       for (int i = 0; i < localapi.a(); i++) {
/* 119 */         add localadd = localapi.a(i);
/* 120 */         if (localadd != null) {
/* 121 */           float f1 = this.a.nextFloat() * 0.8F + 0.1F;
/* 122 */           float f2 = this.a.nextFloat() * 0.8F + 0.1F;
/* 123 */           float f3 = this.a.nextFloat() * 0.8F + 0.1F;
/*     */           
/* 125 */           while (localadd.b > 0) {
/* 126 */             int j = this.a.nextInt(21) + 10;
/* 127 */             if (j > localadd.b) j = localadd.b;
/* 128 */             localadd.b -= j;
/*     */             
/* 130 */             xk localxk = new xk(paramahb, paramInt1 + f1, paramInt2 + f2, paramInt3 + f3, new add(localadd.b(), j, localadd.k()));
/*     */             
/* 132 */             if (localadd.p()) {
/* 133 */               localxk.f().d((dh)localadd.q().b());
/*     */             }
/*     */             
/* 136 */             float f4 = 0.05F;
/* 137 */             localxk.v = ((float)this.a.nextGaussian() * f4);
/* 138 */             localxk.w = ((float)this.a.nextGaussian() * f4 + 0.2F);
/* 139 */             localxk.x = ((float)this.a.nextGaussian() * f4);
/* 140 */             paramahb.d(localxk);
/*     */           }
/*     */         }
/*     */       }
/* 144 */       paramahb.f(paramInt1, paramInt2, paramInt3, paramaji);
/*     */     }
/*     */     
/* 147 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 152 */     return 38;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 157 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/* 162 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 167 */     return true;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 172 */     if (paramInt1 == 1) {
/* 173 */       return this.M;
/*     */     }
/* 175 */     return this.b;
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 179 */     return paramInt & 0x7;
/*     */   }
/*     */   
/*     */   public static boolean c(int paramInt) {
/* 183 */     return (paramInt & 0x8) != 8;
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 188 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 193 */     return zs.b(e(paramahb, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 198 */     this.b = paramrg.a("hopper_outside");
/* 199 */     this.M = paramrg.a("hopper_top");
/* 200 */     this.N = paramrg.a("hopper_inside");
/*     */   }
/*     */   
/*     */   public static rf e(String paramString)
/*     */   {
/* 205 */     if (paramString.equals("hopper_outside")) return ajn.bZ.b;
/* 206 */     if (paramString.equals("hopper_inside")) return ajn.bZ.N;
/* 207 */     return null;
/*     */   }
/*     */   
/*     */   public String O()
/*     */   {
/* 212 */     return "hopper";
/*     */   }
/*     */   
/*     */   public static api e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 216 */     return (api)paramahl.o(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */