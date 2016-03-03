/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wh
/*     */   extends wf
/*     */ {
/*     */   public wh(ahb paramahb)
/*     */   {
/*  14 */     super(paramahb);
/*  15 */     a(0.9F, 1.3F);
/*     */     
/*  17 */     m().a(true);
/*  18 */     this.c.a(0, new uf(this));
/*  19 */     this.c.a(1, new uz(this, 2.0D));
/*  20 */     this.c.a(2, new ua(this, 1.0D));
/*  21 */     this.c.a(3, new vk(this, 1.25D, ade.O, false));
/*  22 */     this.c.a(4, new uh(this, 1.25D));
/*  23 */     this.c.a(5, new vc(this, 1.0D));
/*  24 */     this.c.a(6, new un(this, yz.class, 6.0F));
/*  25 */     this.c.a(7, new vb(this));
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  30 */     return true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  35 */     super.aD();
/*     */     
/*  37 */     a(yj.a).a(10.0D);
/*  38 */     a(yj.d).a(0.20000000298023224D);
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  43 */     return "mob.cow.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  48 */     return "mob.cow.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  53 */     return "mob.cow.hurt";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  58 */     a("mob.cow.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/*  63 */     return 0.4F;
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/*  68 */     return ade.aA;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/*  74 */     int i = this.Z.nextInt(3) + this.Z.nextInt(1 + paramInt);
/*  75 */     for (int j = 0; j < i; j++) {
/*  76 */       a(ade.aA, 1);
/*     */     }
/*     */     
/*  79 */     i = this.Z.nextInt(3) + 1 + this.Z.nextInt(1 + paramInt);
/*  80 */     for (j = 0; j < i; j++) {
/*  81 */       if (al()) {
/*  82 */         a(ade.be, 1);
/*     */       } else {
/*  84 */         a(ade.bd, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  91 */     add localadd = paramyz.bm.h();
/*  92 */     if ((localadd != null) && (localadd.b() == ade.ar) && (!paramyz.bE.d)) {
/*  93 */       if (localadd.b-- == 1) {
/*  94 */         paramyz.bm.a(paramyz.bm.c, new add(ade.aB));
/*  95 */       } else if (!paramyz.bm.a(new add(ade.aB))) {
/*  96 */         paramyz.a(new add(ade.aB, 1, 0), false);
/*     */       }
/*     */       
/*  99 */       return true;
/*     */     }
/* 101 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   public wh b(rx paramrx)
/*     */   {
/* 106 */     return new wh(this.o);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */