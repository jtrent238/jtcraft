/*    */ import java.lang.reflect.Method;
/*    */ import java.net.URI;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bdd
/*    */   extends bdw
/*    */ {
/* 15 */   private static final Logger a = ;
/*    */   
/*    */ 
/*    */ 
/* 19 */   private static final bqx f = new bqx("textures/gui/demo_background.png");
/*    */   
/*    */   public void b()
/*    */   {
/* 23 */     this.n.clear();
/*    */     
/* 25 */     int i = -16;
/*    */     
/* 27 */     this.n.add(new bcb(1, this.l / 2 - 116, this.m / 2 + 62 + i, 114, 20, brp.a("demo.help.buy", new Object[0])));
/* 28 */     this.n.add(new bcb(2, this.l / 2 + 2, this.m / 2 + 62 + i, 114, 20, brp.a("demo.help.later", new Object[0])));
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 33 */     switch (parambcb.k) {
/*    */     case 2: 
/* 35 */       this.k.a(null);
/* 36 */       this.k.l();
/* 37 */       break;
/*    */     case 1: 
/* 39 */       parambcb.l = false;
/*    */       try {
/* 41 */         Class localClass = Class.forName("java.awt.Desktop");
/* 42 */         Object localObject = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 43 */         localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject, new Object[] { new URI("http://www.minecraft.net/store?source=demo") });
/*    */       } catch (Throwable localThrowable) {
/* 45 */         a.error("Couldn't open link", localThrowable);
/*    */       }
/*    */     }
/*    */     
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 53 */     super.e();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 58 */     super.c();
/*    */     
/* 60 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 61 */     this.k.P().a(f);
/* 62 */     int i = (this.l - 248) / 2;
/* 63 */     int j = (this.m - 166) / 2;
/* 64 */     b(i, j, 0, 0, 248, 166);
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 69 */     c();
/*    */     
/* 71 */     int i = (this.l - 248) / 2 + 10;
/*    */     
/* 73 */     int j = (this.m - 166) / 2 + 8;
/*    */     
/* 75 */     this.q.b(brp.a("demo.help.title", new Object[0]), i, j, 2039583);
/* 76 */     j += 12;
/*    */     
/* 78 */     bbj localbbj = this.k.u;
/*    */     
/* 80 */     this.q.b(brp.a("demo.help.movementShort", new Object[] { bbj.c(localbbj.U.i()), bbj.c(localbbj.V.i()), bbj.c(localbbj.W.i()), bbj.c(localbbj.X.i()) }), i, j, 5197647);
/*    */     
/* 82 */     this.q.b(brp.a("demo.help.movementMouse", new Object[0]), i, j + 12, 5197647);
/*    */     
/* 84 */     this.q.b(brp.a("demo.help.jump", new Object[] { bbj.c(localbbj.Y.i()) }), i, j + 24, 5197647);
/*    */     
/* 86 */     this.q.b(brp.a("demo.help.inventory", new Object[] { bbj.c(localbbj.aa.i()) }), i, j + 36, 5197647);
/*    */     
/* 88 */     this.q.a(brp.a("demo.help.fullWrapped", new Object[0]), i, j + 68, 218, 2039583);
/*    */     
/* 90 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */