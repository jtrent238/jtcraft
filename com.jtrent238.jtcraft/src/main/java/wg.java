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
/*     */ public class wg
/*     */   extends wf
/*     */ {
/*     */   public float bp;
/*     */   public float bq;
/*     */   public float br;
/*     */   public float bs;
/*  22 */   public float bt = 1.0F;
/*     */   public int bu;
/*     */   public boolean bv;
/*     */   
/*     */   public wg(ahb paramahb) {
/*  27 */     super(paramahb);
/*  28 */     a(0.3F, 0.7F);
/*  29 */     this.bu = (this.Z.nextInt(6000) + 6000);
/*     */     
/*  31 */     this.c.a(0, new uf(this));
/*  32 */     this.c.a(1, new uz(this, 1.4D));
/*  33 */     this.c.a(2, new ua(this, 1.0D));
/*  34 */     this.c.a(3, new vk(this, 1.0D, ade.N, false));
/*  35 */     this.c.a(4, new uh(this, 1.1D));
/*  36 */     this.c.a(5, new vc(this, 1.0D));
/*  37 */     this.c.a(6, new un(this, yz.class, 6.0F));
/*  38 */     this.c.a(7, new vb(this));
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  43 */     return true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  48 */     super.aD();
/*     */     
/*  50 */     a(yj.a).a(4.0D);
/*  51 */     a(yj.d).a(0.25D);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  56 */     super.e();
/*     */     
/*  58 */     this.bs = this.bp;
/*  59 */     this.br = this.bq;
/*     */     
/*  61 */     this.bq = ((float)(this.bq + (this.D ? -1 : 4) * 0.3D));
/*  62 */     if (this.bq < 0.0F) this.bq = 0.0F;
/*  63 */     if (this.bq > 1.0F) { this.bq = 1.0F;
/*     */     }
/*  65 */     if ((!this.D) && (this.bt < 1.0F)) this.bt = 1.0F;
/*  66 */     this.bt = ((float)(this.bt * 0.9D));
/*     */     
/*  68 */     if ((!this.D) && (this.w < 0.0D)) {
/*  69 */       this.w *= 0.6D;
/*     */     }
/*     */     
/*  72 */     this.bp += this.bt * 2.0F;
/*     */     
/*  74 */     if ((!this.o.E) && (!f()) && (!bZ()) && (--this.bu <= 0)) {
/*  75 */       a("mob.chicken.plop", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*  76 */       a(ade.aK, 1);
/*  77 */       this.bu = (this.Z.nextInt(6000) + 6000);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(float paramFloat) {}
/*     */   
/*     */ 
/*     */   protected String t()
/*     */   {
/*  87 */     return "mob.chicken.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  92 */     return "mob.chicken.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  97 */     return "mob.chicken.hurt";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 102 */     a("mob.chicken.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 107 */     return ade.G;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 113 */     int i = this.Z.nextInt(3) + this.Z.nextInt(1 + paramInt);
/* 114 */     for (int j = 0; j < i; j++) {
/* 115 */       a(ade.G, 1);
/*     */     }
/*     */     
/* 118 */     if (al()) { a(ade.bg, 1);
/*     */     } else {
/* 120 */       a(ade.bf, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public wg b(rx paramrx)
/*     */   {
/* 126 */     return new wg(this.o);
/*     */   }
/*     */   
/*     */   public boolean c(add paramadd)
/*     */   {
/* 131 */     return (paramadd != null) && ((paramadd.b() instanceof adw));
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 136 */     super.a(paramdh);
/* 137 */     this.bv = paramdh.n("IsChickenJockey");
/*     */   }
/*     */   
/*     */   protected int e(yz paramyz)
/*     */   {
/* 142 */     if (bZ()) {
/* 143 */       return 10;
/*     */     }
/* 145 */     return super.e(paramyz);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 150 */     super.b(paramdh);
/* 151 */     paramdh.a("IsChickenJockey", this.bv);
/*     */   }
/*     */   
/*     */   protected boolean v()
/*     */   {
/* 156 */     return (bZ()) && (this.l == null);
/*     */   }
/*     */   
/*     */   public void ac()
/*     */   {
/* 161 */     super.ac();
/* 162 */     float f1 = qh.a(this.aM * 3.1415927F / 180.0F);
/* 163 */     float f2 = qh.b(this.aM * 3.1415927F / 180.0F);
/* 164 */     float f3 = 0.1F;
/* 165 */     float f4 = 0.0F;
/*     */     
/* 167 */     this.l.b(this.s + f3 * f1, this.t + this.N * 0.5F + this.l.ad() + f4, this.u - f3 * f2);
/* 168 */     if ((this.l instanceof sv)) {
/* 169 */       ((sv)this.l).aM = this.aM;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/* 174 */     return this.bv;
/*     */   }
/*     */   
/*     */   public void i(boolean paramBoolean) {
/* 178 */     this.bv = paramBoolean;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */