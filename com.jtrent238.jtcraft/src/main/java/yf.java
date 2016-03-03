/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ public class yf
/*     */   extends ym
/*     */ {
/*     */   public yf(ahb paramahb)
/*     */   {
/*  10 */     super(paramahb);
/*  11 */     this.ae = true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  16 */     super.aD();
/*     */     
/*  18 */     a(yj.d).a(0.20000000298023224D);
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/*  23 */     return (this.o.r != rd.a) && (this.o.b(this.C)) && (this.o.a(this, this.C).isEmpty()) && (!this.o.d(this.C));
/*     */   }
/*     */   
/*     */   public int aV()
/*     */   {
/*  28 */     return bX() * 3;
/*     */   }
/*     */   
/*     */   public int c(float paramFloat)
/*     */   {
/*  33 */     return 15728880;
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/*  38 */     return 1.0F;
/*     */   }
/*     */   
/*     */   protected String bP()
/*     */   {
/*  43 */     return "flame";
/*     */   }
/*     */   
/*     */   protected ym bQ()
/*     */   {
/*  48 */     return new yf(this.o);
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/*  53 */     return ade.bs;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/*  58 */     adb localadb = u();
/*  59 */     if ((localadb != null) && (bX() > 1)) {
/*  60 */       int i = this.Z.nextInt(4) - 2;
/*  61 */       if (paramInt > 0) {
/*  62 */         i += this.Z.nextInt(paramInt + 1);
/*     */       }
/*  64 */       for (int j = 0; j < i; j++) {
/*  65 */         a(localadb, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean al()
/*     */   {
/*  72 */     return false;
/*     */   }
/*     */   
/*     */   protected int bR()
/*     */   {
/*  77 */     return super.bR() * 4;
/*     */   }
/*     */   
/*     */   protected void bS()
/*     */   {
/*  82 */     this.h *= 0.9F;
/*     */   }
/*     */   
/*     */   protected void bj()
/*     */   {
/*  87 */     this.w = (0.42F + bX() * 0.1F);
/*  88 */     this.al = true;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(float paramFloat) {}
/*     */   
/*     */ 
/*     */   protected boolean bT()
/*     */   {
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   protected int bU()
/*     */   {
/* 102 */     return super.bU() + 2;
/*     */   }
/*     */   
/*     */   protected String bV()
/*     */   {
/* 107 */     if (bX() > 1) {
/* 108 */       return "mob.magmacube.big";
/*     */     }
/* 110 */     return "mob.magmacube.small";
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean P()
/*     */   {
/* 116 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean bW()
/*     */   {
/* 121 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */