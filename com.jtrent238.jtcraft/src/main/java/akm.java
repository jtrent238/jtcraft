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
/*     */ public class akm
/*     */   extends ajc
/*     */ {
/*  24 */   public static final cz a = new co(new cm());
/*  25 */   protected Random b = new Random();
/*     */   protected rf M;
/*     */   protected rf N;
/*     */   protected rf O;
/*     */   
/*     */   protected akm() {
/*  31 */     super(awt.e);
/*  32 */     a(abt.d);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  37 */     return 4;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  43 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  47 */     if (paramahb.E) {
/*  48 */       return;
/*     */     }
/*     */     
/*  51 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/*  52 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/*  53 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/*  54 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  56 */     int i = 3;
/*  57 */     if ((localaji1.j()) && (!localaji2.j())) i = 3;
/*  58 */     if ((localaji2.j()) && (!localaji1.j())) i = 2;
/*  59 */     if ((localaji3.j()) && (!localaji4.j())) i = 5;
/*  60 */     if ((localaji4.j()) && (!localaji3.j())) i = 4;
/*  61 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  66 */     int i = paramInt2 & 0x7;
/*     */     
/*  68 */     if (paramInt1 == i) {
/*  69 */       if ((i == 1) || (i == 0)) {
/*  70 */         return this.O;
/*     */       }
/*  72 */       return this.N;
/*     */     }
/*     */     
/*     */ 
/*  76 */     if ((i == 1) || (i == 0))
/*  77 */       return this.M;
/*  78 */     if ((paramInt1 == 1) || (paramInt1 == 0)) {
/*  79 */       return this.M;
/*     */     }
/*     */     
/*  82 */     return this.L;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  87 */     this.L = paramrg.a("furnace_side");
/*  88 */     this.M = paramrg.a("furnace_top");
/*  89 */     this.N = paramrg.a(N() + "_front_horizontal");
/*  90 */     this.O = paramrg.a(N() + "_front_vertical");
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  95 */     if (paramahb.E) {
/*  96 */       return true;
/*     */     }
/*  98 */     apb localapb = (apb)paramahb.o(paramInt1, paramInt2, paramInt3);
/*  99 */     if (localapb != null) { paramyz.a(localapb);
/*     */     }
/* 101 */     return true;
/*     */   }
/*     */   
/*     */   protected void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 105 */     cl localcl = new cl(paramahb, paramInt1, paramInt2, paramInt3);
/* 106 */     apb localapb = (apb)localcl.j();
/* 107 */     if (localapb == null) { return;
/*     */     }
/* 109 */     int i = localapb.i();
/* 110 */     if (i < 0) {
/* 111 */       paramahb.c(1001, paramInt1, paramInt2, paramInt3, 0);
/*     */     } else {
/* 113 */       add localadd1 = localapb.a(i);
/* 114 */       cp localcp = a(localadd1);
/*     */       
/* 116 */       if (localcp != cp.a) {
/* 117 */         add localadd2 = localcp.a(localcl, localadd1);
/*     */         
/* 119 */         localapb.a(i, localadd2.b == 0 ? null : localadd2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected cp a(add paramadd) {
/* 125 */     return (cp)a.a(paramadd.b());
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 131 */     int i = (paramahb.v(paramInt1, paramInt2, paramInt3)) || (paramahb.v(paramInt1, paramInt2 + 1, paramInt3)) ? 1 : 0;
/* 132 */     int j = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 133 */     int k = (j & 0x8) != 0 ? 1 : 0;
/*     */     
/* 135 */     if ((i != 0) && (k == 0)) {
/* 136 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/* 137 */       paramahb.a(paramInt1, paramInt2, paramInt3, j | 0x8, 4);
/*     */     }
/* 139 */     else if ((i == 0) && (k != 0)) {
/* 140 */       paramahb.a(paramInt1, paramInt2, paramInt3, j & 0xFFFFFFF7, 4);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 147 */     if (!paramahb.E) {
/* 148 */       e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/* 154 */     return new apb();
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 159 */     int i = app.a(paramahb, paramInt1, paramInt2, paramInt3, paramsv);
/*     */     
/* 161 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */     
/* 163 */     if (paramadd.u()) {
/* 164 */       ((apb)paramahb.o(paramInt1, paramInt2, paramInt3)).a(paramadd.s());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 170 */     apb localapb = (apb)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 171 */     if (localapb != null) {
/* 172 */       for (int i = 0; i < localapb.a(); i++) {
/* 173 */         add localadd = localapb.a(i);
/* 174 */         if (localadd != null) {
/* 175 */           float f1 = this.b.nextFloat() * 0.8F + 0.1F;
/* 176 */           float f2 = this.b.nextFloat() * 0.8F + 0.1F;
/* 177 */           float f3 = this.b.nextFloat() * 0.8F + 0.1F;
/*     */           
/* 179 */           while (localadd.b > 0) {
/* 180 */             int j = this.b.nextInt(21) + 10;
/* 181 */             if (j > localadd.b) j = localadd.b;
/* 182 */             localadd.b -= j;
/*     */             
/* 184 */             xk localxk = new xk(paramahb, paramInt1 + f1, paramInt2 + f2, paramInt3 + f3, new add(localadd.b(), j, localadd.k()));
/*     */             
/* 186 */             if (localadd.p()) {
/* 187 */               localxk.f().d((dh)localadd.q().b());
/*     */             }
/*     */             
/* 190 */             float f4 = 0.05F;
/* 191 */             localxk.v = ((float)this.b.nextGaussian() * f4);
/* 192 */             localxk.w = ((float)this.b.nextGaussian() * f4 + 0.2F);
/* 193 */             localxk.x = ((float)this.b.nextGaussian() * f4);
/* 194 */             paramahb.d(localxk);
/*     */           }
/*     */         }
/*     */       }
/* 198 */       paramahb.f(paramInt1, paramInt2, paramInt3, paramaji);
/*     */     }
/* 200 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public static cx a(ck paramck) {
/* 204 */     cr localcr = b(paramck.h());
/*     */     
/* 206 */     double d1 = paramck.a() + 0.7D * localcr.c();
/* 207 */     double d2 = paramck.b() + 0.7D * localcr.d();
/* 208 */     double d3 = paramck.c() + 0.7D * localcr.e();
/*     */     
/* 210 */     return new cy(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static cr b(int paramInt) {
/* 214 */     return cr.a(paramInt & 0x7);
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 219 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 224 */     return zs.b((rb)paramahb.o(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */