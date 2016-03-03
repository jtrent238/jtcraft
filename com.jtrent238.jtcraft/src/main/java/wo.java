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
/*     */ public class wo
/*     */   extends wf
/*     */ {
/*     */   private final ub bp;
/*     */   
/*     */   public wo(ahb paramahb)
/*     */   {
/*  20 */     super(paramahb);
/*  21 */     a(0.9F, 0.9F);
/*     */     
/*  23 */     m().a(true);
/*  24 */     this.c.a(0, new uf(this));
/*  25 */     this.c.a(1, new uz(this, 1.25D));
/*  26 */     this.c.a(2, this.bp = new ub(this, 0.3F));
/*  27 */     this.c.a(3, new ua(this, 1.0D));
/*  28 */     this.c.a(4, new vk(this, 1.2D, ade.bM, false));
/*  29 */     this.c.a(4, new vk(this, 1.2D, ade.bF, false));
/*  30 */     this.c.a(5, new uh(this, 1.1D));
/*  31 */     this.c.a(6, new vc(this, 1.0D));
/*  32 */     this.c.a(7, new un(this, yz.class, 6.0F));
/*  33 */     this.c.a(8, new vb(this));
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  38 */     return true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  43 */     super.aD();
/*     */     
/*  45 */     a(yj.a).a(10.0D);
/*  46 */     a(yj.d).a(0.25D);
/*     */   }
/*     */   
/*     */   protected void bn()
/*     */   {
/*  51 */     super.bn();
/*     */   }
/*     */   
/*     */   public boolean bE()
/*     */   {
/*  56 */     add localadd = ((yz)this.l).be();
/*     */     
/*  58 */     return (localadd != null) && (localadd.b() == ade.bM);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  63 */     super.c();
/*  64 */     this.af.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  69 */     super.b(paramdh);
/*  70 */     paramdh.a("Saddle", bZ());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  75 */     super.a(paramdh);
/*  76 */     i(paramdh.n("Saddle"));
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  81 */     return "mob.pig.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  86 */     return "mob.pig.say";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  91 */     return "mob.pig.death";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  96 */     a("mob.pig.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 101 */     if (!super.a(paramyz)) {
/* 102 */       if ((bZ()) && (!this.o.E) && ((this.l == null) || (this.l == paramyz))) {
/* 103 */         paramyz.a(this);
/* 104 */         return true;
/*     */       }
/* 106 */       return false;
/*     */     }
/* 108 */     return true;
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 113 */     if (al()) return ade.am;
/* 114 */     return ade.al;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 119 */     int i = this.Z.nextInt(3) + 1 + this.Z.nextInt(1 + paramInt);
/*     */     
/* 121 */     for (int j = 0; j < i; j++) {
/* 122 */       if (al()) {
/* 123 */         a(ade.am, 1);
/*     */       } else {
/* 125 */         a(ade.al, 1);
/*     */       }
/*     */     }
/*     */     
/* 129 */     if (bZ()) a(ade.av, 1);
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/* 133 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   public void i(boolean paramBoolean) {
/* 137 */     if (paramBoolean) {
/* 138 */       this.af.b(16, Byte.valueOf((byte)1));
/*     */     } else {
/* 140 */       this.af.b(16, Byte.valueOf((byte)0));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(xh paramxh)
/*     */   {
/* 146 */     if (this.o.E) { return;
/*     */     }
/* 148 */     yh localyh = new yh(this.o);
/* 149 */     localyh.c(0, new add(ade.B));
/* 150 */     localyh.b(this.s, this.t, this.u, this.y, this.z);
/* 151 */     this.o.d(localyh);
/* 152 */     B();
/*     */   }
/*     */   
/*     */   protected void b(float paramFloat)
/*     */   {
/* 157 */     super.b(paramFloat);
/*     */     
/* 159 */     if ((paramFloat > 5.0F) && ((this.l instanceof yz))) {
/* 160 */       ((yz)this.l).a(pc.u);
/*     */     }
/*     */   }
/*     */   
/*     */   public wo b(rx paramrx)
/*     */   {
/* 166 */     return new wo(this.o);
/*     */   }
/*     */   
/*     */   public boolean c(add paramadd)
/*     */   {
/* 171 */     return (paramadd != null) && (paramadd.b() == ade.bF);
/*     */   }
/*     */   
/*     */   public ub ca() {
/* 175 */     return this.bp;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */