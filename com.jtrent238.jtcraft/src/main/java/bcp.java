/*    */ import net.minecraft.realms.RealmsButton;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcp
/*    */   extends bcb
/*    */ {
/*    */   private RealmsButton o;
/*    */   
/*    */   public bcp(RealmsButton paramRealmsButton, int paramInt1, int paramInt2, int paramInt3, String paramString)
/*    */   {
/* 12 */     super(paramInt1, paramInt2, paramInt3, paramString);
/* 13 */     this.o = paramRealmsButton;
/*    */   }
/*    */   
/*    */   public bcp(RealmsButton paramRealmsButton, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, int paramInt5) {
/* 17 */     super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
/* 18 */     this.o = paramRealmsButton;
/*    */   }
/*    */   
/*    */   public int d() {
/* 22 */     return this.k;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 26 */     return this.l;
/*    */   }
/*    */   
/*    */   public void b(boolean paramBoolean) {
/* 30 */     this.l = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(String paramString) {
/* 34 */     this.j = paramString;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 39 */     return super.b();
/*    */   }
/*    */   
/*    */   public int f() {
/* 43 */     return this.i;
/*    */   }
/*    */   
/*    */   public boolean c(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 48 */     if (super.c(parambao, paramInt1, paramInt2)) {
/* 49 */       this.o.clicked(paramInt1, paramInt2);
/*    */     }
/* 51 */     return super.c(parambao, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2)
/*    */   {
/* 56 */     this.o.released(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void b(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 61 */     this.o.renderBg(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public RealmsButton g() {
/* 65 */     return this.o;
/*    */   }
/*    */   
/*    */   public int a(boolean paramBoolean)
/*    */   {
/* 70 */     return this.o.getYImage(paramBoolean);
/*    */   }
/*    */   
/*    */   public int c(boolean paramBoolean) {
/* 74 */     return super.a(paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */