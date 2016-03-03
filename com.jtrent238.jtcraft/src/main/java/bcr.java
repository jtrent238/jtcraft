/*    */ import net.minecraft.realms.RealmsScrolledSelectionList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcr
/*    */   extends bcm
/*    */ {
/*    */   private final RealmsScrolledSelectionList k;
/*    */   
/*    */   public bcr(RealmsScrolledSelectionList paramRealmsScrolledSelectionList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 13 */     super(bao.B(), paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 14 */     this.k = paramRealmsScrolledSelectionList;
/*    */   }
/*    */   
/*    */   protected int b()
/*    */   {
/* 19 */     return this.k.getItemCount();
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*    */   {
/* 24 */     this.k.selectItem(paramInt1, paramBoolean, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected boolean a(int paramInt)
/*    */   {
/* 29 */     return this.k.isSelectedItem(paramInt);
/*    */   }
/*    */   
/*    */   protected void a()
/*    */   {
/* 34 */     this.k.renderBackground();
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6)
/*    */   {
/* 39 */     this.k.renderItem(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */   }
/*    */   
/*    */   public int k() {
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public int l() {
/* 47 */     return this.h;
/*    */   }
/*    */   
/*    */   public int m() {
/* 51 */     return this.g;
/*    */   }
/*    */   
/*    */   protected int e()
/*    */   {
/* 56 */     return this.k.getMaxPosition();
/*    */   }
/*    */   
/*    */   protected int d()
/*    */   {
/* 61 */     return this.k.getScrollbarPosition();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */