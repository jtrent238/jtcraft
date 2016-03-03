/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class boq
/*    */   extends bok
/*    */ {
/*  9 */   private static final bqx a = new bqx("textures/entity/sheep/sheep_fur.png");
/* 10 */   private static final bqx f = new bqx("textures/entity/sheep/sheep.png");
/*    */   
/*    */   public boq(bhr parambhr1, bhr parambhr2, float paramFloat) {
/* 13 */     super(parambhr1, paramFloat);
/* 14 */     a(parambhr2);
/*    */   }
/*    */   
/*    */   protected int a(wp paramwp, int paramInt, float paramFloat)
/*    */   {
/* 19 */     if ((paramInt == 0) && (!paramwp.ca())) {
/* 20 */       a(a);
/*    */       int i;
/* 22 */       if ((paramwp.bH()) && ("jeb_".equals(paramwp.bG())))
/*    */       {
/* 24 */         i = 25;
/* 25 */         int j = paramwp.aa / 25 + paramwp.y();
/* 26 */         int k = j % wp.bp.length;
/* 27 */         int m = (j + 1) % wp.bp.length;
/* 28 */         float f1 = (paramwp.aa % 25 + paramFloat) / 25.0F;
/*    */         
/* 30 */         GL11.glColor3f(wp.bp[k][0] * (1.0F - f1) + wp.bp[m][0] * f1, wp.bp[k][1] * (1.0F - f1) + wp.bp[m][1] * f1, wp.bp[k][2] * (1.0F - f1) + wp.bp[m][2] * f1);
/*    */       }
/*    */       else {
/* 33 */         i = paramwp.bZ();
/* 34 */         GL11.glColor3f(wp.bp[i][0], wp.bp[i][1], wp.bp[i][2]);
/*    */       }
/*    */       
/* 37 */       return 1;
/*    */     }
/* 39 */     return -1;
/*    */   }
/*    */   
/*    */   protected bqx a(wp paramwp)
/*    */   {
/* 44 */     return f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\boq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */