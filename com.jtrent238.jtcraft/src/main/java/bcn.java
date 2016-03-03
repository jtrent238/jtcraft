/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcn
/*    */   extends bcb
/*    */ {
/* 10 */   private float p = 1.0F;
/*    */   public boolean o;
/*    */   private bbm q;
/*    */   private final float r;
/*    */   private final float s;
/*    */   
/*    */   public bcn(int paramInt1, int paramInt2, int paramInt3, bbm parambbm) {
/* 17 */     this(paramInt1, paramInt2, paramInt3, parambbm, 0.0F, 1.0F);
/*    */   }
/*    */   
/*    */   public bcn(int paramInt1, int paramInt2, int paramInt3, bbm parambbm, float paramFloat1, float paramFloat2) {
/* 21 */     super(paramInt1, paramInt2, paramInt3, 150, 20, "");
/* 22 */     this.q = parambbm;
/* 23 */     this.r = paramFloat1;
/* 24 */     this.s = paramFloat2;
/*    */     
/* 26 */     bao localbao = bao.B();
/* 27 */     this.p = parambbm.c(localbao.u.a(parambbm));
/* 28 */     this.j = localbao.u.c(parambbm);
/*    */   }
/*    */   
/*    */   public int a(boolean paramBoolean)
/*    */   {
/* 33 */     return 0;
/*    */   }
/*    */   
/*    */   protected void b(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 38 */     if (!this.m) { return;
/*    */     }
/* 40 */     if (this.o) {
/* 41 */       this.p = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/* 42 */       if (this.p < 0.0F) this.p = 0.0F;
/* 43 */       if (this.p > 1.0F) this.p = 1.0F;
/* 44 */       float f = this.q.d(this.p);
/* 45 */       parambao.u.a(this.q, f);
/* 46 */       this.p = this.q.c(f);
/* 47 */       this.j = parambao.u.c(this.q);
/*    */     }
/*    */     
/* 50 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 51 */     b(this.h + (int)(this.p * (this.f - 8)), this.i, 0, 66, 4, 20);
/* 52 */     b(this.h + (int)(this.p * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
/*    */   }
/*    */   
/*    */   public boolean c(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 57 */     if (super.c(parambao, paramInt1, paramInt2)) {
/* 58 */       this.p = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/* 59 */       if (this.p < 0.0F) this.p = 0.0F;
/* 60 */       if (this.p > 1.0F) this.p = 1.0F;
/* 61 */       parambao.u.a(this.q, this.q.d(this.p));
/* 62 */       this.j = parambao.u.c(this.q);
/* 63 */       this.o = true;
/* 64 */       return true;
/*    */     }
/*    */     
/* 67 */     return false;
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2)
/*    */   {
/* 72 */     this.o = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */