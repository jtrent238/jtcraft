/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmn
/*    */   extends bml
/*    */ {
/* 10 */   private static final bqx b = new bqx("textures/entity/enchanting_table_book.png");
/* 11 */   private bhf c = new bhf();
/*    */   
/*    */   public void a(apd paramapd, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*    */   {
/* 15 */     GL11.glPushMatrix();
/* 16 */     GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F, (float)paramDouble3 + 0.5F);
/*    */     
/* 18 */     float f1 = paramapd.a + paramFloat;
/*    */     
/* 20 */     GL11.glTranslatef(0.0F, 0.1F + qh.a(f1 * 0.1F) * 0.01F, 0.0F);
/* 21 */     float f2 = paramapd.o - paramapd.p;
/* 22 */     while (f2 >= 3.1415927F)
/* 23 */       f2 -= 6.2831855F;
/* 24 */     while (f2 < -3.1415927F) {
/* 25 */       f2 += 6.2831855F;
/*    */     }
/* 27 */     float f3 = paramapd.p + f2 * paramFloat;
/*    */     
/* 29 */     GL11.glRotatef(-f3 * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
/* 30 */     GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
/* 31 */     a(b);
/*    */     
/* 33 */     float f4 = paramapd.j + (paramapd.i - paramapd.j) * paramFloat + 0.25F;
/* 34 */     float f5 = paramapd.j + (paramapd.i - paramapd.j) * paramFloat + 0.75F;
/* 35 */     f4 = (f4 - qh.b(f4)) * 1.6F - 0.3F;
/* 36 */     f5 = (f5 - qh.b(f5)) * 1.6F - 0.3F;
/*    */     
/* 38 */     if (f4 < 0.0F) f4 = 0.0F;
/* 39 */     if (f5 < 0.0F) f5 = 0.0F;
/* 40 */     if (f4 > 1.0F) f4 = 1.0F;
/* 41 */     if (f5 > 1.0F) { f5 = 1.0F;
/*    */     }
/* 43 */     float f6 = paramapd.n + (paramapd.m - paramapd.n) * paramFloat;
/* 44 */     GL11.glEnable(2884);
/* 45 */     this.c.a(null, f1, f4, f5, f6, 0.0F, 0.0625F);
/* 46 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */