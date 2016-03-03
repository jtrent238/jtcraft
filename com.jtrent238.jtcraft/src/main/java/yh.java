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
/*     */ public class yh
/*     */   extends yq
/*     */ {
/*  20 */   private static final UUID bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
/*  21 */   private static final tj br = new tj(bq, "Attacking speed boost", 0.45D, 0).a(false);
/*     */   private int bs;
/*     */   private int bt;
/*     */   private sa bu;
/*     */   
/*     */   public yh(ahb paramahb)
/*     */   {
/*  28 */     super(paramahb);
/*  29 */     this.ae = true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  34 */     super.aD();
/*     */     
/*  36 */     a(bp).a(0.0D);
/*  37 */     a(yj.d).a(0.5D);
/*  38 */     a(yj.e).a(5.0D);
/*     */   }
/*     */   
/*     */   protected boolean bk()
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  48 */     if ((this.bu != this.bm) && (!this.o.E)) {
/*  49 */       ti localti = a(yj.d);
/*  50 */       localti.b(br);
/*     */       
/*  52 */       if (this.bm != null) {
/*  53 */         localti.a(br);
/*     */       }
/*     */     }
/*  56 */     this.bu = this.bm;
/*     */     
/*  58 */     if ((this.bt > 0) && 
/*  59 */       (--this.bt == 0)) {
/*  60 */       a("mob.zombiepig.zpigangry", bf() * 2.0F, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/*     */     }
/*     */     
/*  63 */     super.h();
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/*  68 */     return (this.o.r != rd.a) && (this.o.b(this.C)) && (this.o.a(this, this.C).isEmpty()) && (!this.o.d(this.C));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  73 */     super.b(paramdh);
/*  74 */     paramdh.a("Anger", (short)this.bs);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  79 */     super.a(paramdh);
/*  80 */     this.bs = paramdh.e("Anger");
/*     */   }
/*     */   
/*     */   protected sa bR()
/*     */   {
/*  85 */     if (this.bs == 0) return null;
/*  86 */     return super.bR();
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  91 */     if (aw()) return false;
/*  92 */     sa localsa1 = paramro.j();
/*  93 */     if ((localsa1 instanceof yz)) {
/*  94 */       List localList = this.o.b(this, this.C.b(32.0D, 32.0D, 32.0D));
/*  95 */       for (int i = 0; i < localList.size(); i++) {
/*  96 */         sa localsa2 = (sa)localList.get(i);
/*  97 */         if ((localsa2 instanceof yh)) {
/*  98 */           yh localyh = (yh)localsa2;
/*  99 */           localyh.c(localsa1);
/*     */         }
/*     */       }
/* 102 */       c(localsa1);
/*     */     }
/* 104 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   private void c(sa paramsa) {
/* 108 */     this.bm = paramsa;
/* 109 */     this.bs = (400 + this.Z.nextInt(400));
/* 110 */     this.bt = this.Z.nextInt(40);
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 115 */     return "mob.zombiepig.zpig";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 120 */     return "mob.zombiepig.zpighurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 125 */     return "mob.zombiepig.zpigdeath";
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 130 */     int i = this.Z.nextInt(2 + paramInt);
/* 131 */     for (int j = 0; j < i; j++) {
/* 132 */       a(ade.bh, 1);
/*     */     }
/* 134 */     i = this.Z.nextInt(2 + paramInt);
/* 135 */     for (j = 0; j < i; j++) {
/* 136 */       a(ade.bl, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 142 */     return false;
/*     */   }
/*     */   
/*     */   protected void n(int paramInt)
/*     */   {
/* 147 */     a(ade.k, 1);
/*     */   }
/*     */   
/*     */   protected void bC()
/*     */   {
/* 152 */     c(0, new add(ade.B));
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 157 */     super.a(paramsy);
/* 158 */     j(false);
/* 159 */     return paramsy;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */