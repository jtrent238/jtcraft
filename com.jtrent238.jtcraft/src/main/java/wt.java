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
/*     */ public class wt
/*     */   extends wl
/*     */ {
/*     */   private int bq;
/*     */   vz bp;
/*     */   private int br;
/*     */   private int bs;
/*     */   
/*     */   public wt(ahb paramahb)
/*     */   {
/*  33 */     super(paramahb);
/*  34 */     a(1.4F, 2.9F);
/*     */     
/*  36 */     m().a(true);
/*     */     
/*  38 */     this.c.a(1, new uq(this, 1.0D, true));
/*  39 */     this.c.a(2, new uu(this, 0.9D, 32.0F));
/*  40 */     this.c.a(3, new us(this, 0.6D, true));
/*  41 */     this.c.a(4, new ut(this, 1.0D));
/*  42 */     this.c.a(5, new ux(this));
/*  43 */     this.c.a(6, new vc(this, 0.6D));
/*  44 */     this.c.a(7, new un(this, yz.class, 6.0F));
/*  45 */     this.c.a(8, new vb(this));
/*     */     
/*  47 */     this.d.a(1, new vm(this));
/*  48 */     this.d.a(2, new vn(this, false));
/*  49 */     this.d.a(3, new vo(this, sw.class, 0, false, true, yb.a));
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  54 */     super.c();
/*  55 */     this.af.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  60 */     return true;
/*     */   }
/*     */   
/*     */   protected void bp()
/*     */   {
/*  65 */     if (--this.bq <= 0) {
/*  66 */       this.bq = (70 + this.Z.nextInt(50));
/*  67 */       this.bp = this.o.A.a(qh.c(this.s), qh.c(this.t), qh.c(this.u), 32);
/*  68 */       if (this.bp == null) { bX();
/*     */       } else {
/*  70 */         r localr = this.bp.a();
/*  71 */         a(localr.a, localr.b, localr.c, (int)(this.bp.b() * 0.6F));
/*     */       }
/*     */     }
/*     */     
/*  75 */     super.bp();
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  80 */     super.aD();
/*     */     
/*  82 */     a(yj.a).a(100.0D);
/*  83 */     a(yj.d).a(0.25D);
/*     */   }
/*     */   
/*     */ 
/*     */   protected int j(int paramInt)
/*     */   {
/*  89 */     return paramInt;
/*     */   }
/*     */   
/*     */   protected void o(sa paramsa)
/*     */   {
/*  94 */     if (((paramsa instanceof yb)) && 
/*  95 */       (aI().nextInt(20) == 0)) {
/*  96 */       d((sv)paramsa);
/*     */     }
/*     */     
/*  99 */     super.o(paramsa);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 104 */     super.e();
/*     */     
/* 106 */     if (this.br > 0) this.br -= 1;
/* 107 */     if (this.bs > 0) { this.bs -= 1;
/*     */     }
/* 109 */     if ((this.v * this.v + this.x * this.x > 2.500000277905201E-7D) && (this.Z.nextInt(5) == 0)) {
/* 110 */       int i = qh.c(this.s);
/* 111 */       int j = qh.c(this.t - 0.20000000298023224D - this.L);
/* 112 */       int k = qh.c(this.u);
/* 113 */       aji localaji = this.o.a(i, j, k);
/* 114 */       if (localaji.o() != awt.a) {
/* 115 */         this.o.a("blockcrack_" + aji.b(localaji) + "_" + this.o.e(i, j, k), this.s + (this.Z.nextFloat() - 0.5D) * this.M, this.C.b + 0.1D, this.u + (this.Z.nextFloat() - 0.5D) * this.M, 4.0D * (this.Z.nextFloat() - 0.5D), 0.5D, (this.Z.nextFloat() - 0.5D) * 4.0D);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(Class paramClass)
/*     */   {
/* 122 */     if ((cc()) && (yz.class.isAssignableFrom(paramClass))) return false;
/* 123 */     return super.a(paramClass);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 128 */     super.b(paramdh);
/* 129 */     paramdh.a("PlayerCreated", cc());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 134 */     super.a(paramdh);
/* 135 */     i(paramdh.n("PlayerCreated"));
/*     */   }
/*     */   
/*     */   public boolean n(sa paramsa)
/*     */   {
/* 140 */     this.br = 10;
/* 141 */     this.o.a(this, (byte)4);
/* 142 */     boolean bool = paramsa.a(ro.a(this), 7 + this.Z.nextInt(15));
/* 143 */     if (bool) paramsa.w += 0.4000000059604645D;
/* 144 */     a("mob.irongolem.throw", 1.0F, 1.0F);
/* 145 */     return bool;
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 150 */     if (paramByte == 4) {
/* 151 */       this.br = 10;
/* 152 */       a("mob.irongolem.throw", 1.0F, 1.0F);
/* 153 */     } else if (paramByte == 11) {
/* 154 */       this.bs = 400;
/* 155 */     } else { super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/* 159 */   public vz bZ() { return this.bp; }
/*     */   
/*     */   public int ca()
/*     */   {
/* 163 */     return this.br;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 167 */     this.bs = (paramBoolean ? 400 : 0);
/* 168 */     this.o.a(this, (byte)11);
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 173 */     return "mob.irongolem.hit";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 178 */     return "mob.irongolem.death";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 183 */     a("mob.irongolem.walk", 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 188 */     int i = this.Z.nextInt(3);
/* 189 */     for (int j = 0; j < i; j++) {
/* 190 */       a(adb.a(ajn.O), 1, 0.0F);
/*     */     }
/* 192 */     j = 3 + this.Z.nextInt(3);
/* 193 */     for (int k = 0; k < j; k++) {
/* 194 */       a(ade.j, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public int cb() {
/* 199 */     return this.bs;
/*     */   }
/*     */   
/*     */   public boolean cc() {
/* 203 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   public void i(boolean paramBoolean) {
/* 207 */     int i = this.af.a(16);
/* 208 */     if (paramBoolean) {
/* 209 */       this.af.b(16, Byte.valueOf((byte)(i | 0x1)));
/*     */     } else {
/* 211 */       this.af.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/* 217 */     if ((!cc()) && (this.aR != null) && (this.bp != null)) {
/* 218 */       this.bp.a(this.aR.b_(), -5);
/*     */     }
/* 220 */     super.a(paramro);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */