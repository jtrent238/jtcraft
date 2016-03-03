/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class yp
/*     */   extends yg
/*     */   implements yi
/*     */ {
/*  23 */   private static final UUID bp = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
/*  24 */   private static final tj bq = new tj(bp, "Drinking speed penalty", -0.25D, 0).a(false);
/*     */   
/*     */ 
/*  27 */   private static final adb[] br = { ade.aO, ade.aT, ade.ax, ade.bp, ade.bo, ade.H, ade.y, ade.y };
/*     */   
/*     */ 
/*     */   private int bs;
/*     */   
/*     */ 
/*     */   public yp(ahb paramahb)
/*     */   {
/*  35 */     super(paramahb);
/*     */     
/*  37 */     this.c.a(1, new uf(this));
/*  38 */     this.c.a(2, new vd(this, 1.0D, 60, 10.0F));
/*  39 */     this.c.a(2, new vc(this, 1.0D));
/*  40 */     this.c.a(3, new un(this, yz.class, 8.0F));
/*  41 */     this.c.a(3, new vb(this));
/*     */     
/*  43 */     this.d.a(1, new vn(this, false));
/*  44 */     this.d.a(2, new vo(this, yz.class, 0, true));
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  49 */     super.c();
/*     */     
/*  51 */     z().a(21, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  56 */     return "mob.witch.idle";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  61 */     return "mob.witch.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  66 */     return "mob.witch.death";
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  70 */     z().b(21, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/*  74 */     return z().a(21) == 1;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  79 */     super.aD();
/*     */     
/*  81 */     a(yj.a).a(26.0D);
/*  82 */     a(yj.d).a(0.25D);
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  87 */     return true;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  92 */     if (!this.o.E) { Object localObject;
/*  93 */       if (bZ()) {
/*  94 */         if (this.bs-- <= 0) {
/*  95 */           a(false);
/*  96 */           add localadd = be();
/*  97 */           c(0, null);
/*     */           
/*  99 */           if ((localadd != null) && (localadd.b() == ade.bn)) {
/* 100 */             localObject = ade.bn.g(localadd);
/* 101 */             if (localObject != null) {
/* 102 */               for (rw localrw : (List)localObject) {
/* 103 */                 c(new rw(localrw));
/*     */               }
/*     */             }
/*     */           }
/*     */           
/* 108 */           a(yj.d).b(bq);
/*     */         }
/*     */       } else {
/* 111 */         int i = -1;
/*     */         
/* 113 */         if ((this.Z.nextFloat() < 0.15F) && (a(awt.h)) && (!a(rv.o))) {
/* 114 */           i = 8237;
/* 115 */         } else if ((this.Z.nextFloat() < 0.15F) && (al()) && (!a(rv.n))) {
/* 116 */           i = 16307;
/* 117 */         } else if ((this.Z.nextFloat() < 0.05F) && (aS() < aY())) {
/* 118 */           i = 16341;
/* 119 */         } else if ((this.Z.nextFloat() < 0.25F) && (o() != null) && (!a(rv.c)) && (o().f(this) > 121.0D)) {
/* 120 */           i = 16274;
/* 121 */         } else if ((this.Z.nextFloat() < 0.25F) && (o() != null) && (!a(rv.c)) && (o().f(this) > 121.0D)) {
/* 122 */           i = 16274;
/*     */         }
/*     */         
/* 125 */         if (i > -1) {
/* 126 */           c(0, new add(ade.bn, 1, i));
/* 127 */           this.bs = be().n();
/* 128 */           a(true);
/* 129 */           localObject = a(yj.d);
/* 130 */           ((ti)localObject).b(bq);
/* 131 */           ((ti)localObject).a(bq);
/*     */         }
/*     */       }
/*     */       
/* 135 */       if (this.Z.nextFloat() < 7.5E-4F) {
/* 136 */         this.o.a(this, (byte)15);
/*     */       }
/*     */     }
/*     */     
/* 140 */     super.e();
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 145 */     if (paramByte == 15) {
/* 146 */       for (int i = 0; i < this.Z.nextInt(35) + 10; i++) {
/* 147 */         this.o.a("witchMagic", this.s + this.Z.nextGaussian() * 0.12999999523162842D, this.C.e + 0.5D + this.Z.nextGaussian() * 0.12999999523162842D, this.u + this.Z.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } else {
/* 150 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   protected float c(ro paramro, float paramFloat)
/*     */   {
/* 156 */     paramFloat = super.c(paramro, paramFloat);
/*     */     
/* 158 */     if (paramro.j() == this) paramFloat = 0.0F;
/* 159 */     if (paramro.s()) { paramFloat = (float)(paramFloat * 0.15D);
/*     */     }
/* 161 */     return paramFloat;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 166 */     int i = this.Z.nextInt(3) + 1;
/* 167 */     for (int j = 0; j < i; j++) {
/* 168 */       int k = this.Z.nextInt(3);
/* 169 */       adb localadb = br[this.Z.nextInt(br.length)];
/* 170 */       if (paramInt > 0) { k += this.Z.nextInt(paramInt + 1);
/*     */       }
/* 172 */       for (int m = 0; m < k; m++) {
/* 173 */         a(localadb, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat)
/*     */   {
/* 180 */     if (bZ()) { return;
/*     */     }
/* 182 */     zo localzo = new zo(this.o, this, 32732);
/* 183 */     localzo.z -= -20.0F;
/* 184 */     double d1 = paramsv.s + paramsv.v - this.s;
/* 185 */     double d2 = paramsv.t + paramsv.g() - 1.100000023841858D - this.t;
/* 186 */     double d3 = paramsv.u + paramsv.x - this.u;
/* 187 */     float f = qh.a(d1 * d1 + d3 * d3);
/*     */     
/* 189 */     if ((f >= 8.0F) && (!paramsv.a(rv.d))) {
/* 190 */       localzo.a(32698);
/* 191 */     } else if ((paramsv.aS() >= 8.0F) && (!paramsv.a(rv.u))) {
/* 192 */       localzo.a(32660);
/* 193 */     } else if ((f <= 3.0F) && (!paramsv.a(rv.t)) && (this.Z.nextFloat() < 0.25F)) {
/* 194 */       localzo.a(32696);
/*     */     }
/*     */     
/* 197 */     localzo.c(d1, d2 + f * 0.2F, d3, 0.75F, 8.0F);
/*     */     
/* 199 */     this.o.d(localzo);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */