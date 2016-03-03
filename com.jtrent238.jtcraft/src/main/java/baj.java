/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.lwjgl.util.glu.GLU;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class baj
/*    */ {
/*    */   public static float a;
/*    */   public static float b;
/*    */   public static float c;
/* 23 */   private static IntBuffer i = ban.f(16);
/* 24 */   private static FloatBuffer j = ban.h(16);
/* 25 */   private static FloatBuffer k = ban.h(16);
/*    */   
/* 27 */   private static FloatBuffer l = ban.h(3);
/*    */   public static float d;
/*    */   public static float e;
/*    */   
/*    */   public static void a(yz paramyz, boolean paramBoolean) {
/* 32 */     GL11.glGetFloat(2982, j);
/* 33 */     GL11.glGetFloat(2983, k);
/* 34 */     GL11.glGetInteger(2978, i);
/*    */     
/* 36 */     float f1 = (i.get(0) + i.get(2)) / 2;
/* 37 */     float f2 = (i.get(1) + i.get(3)) / 2;
/* 38 */     GLU.gluUnProject(f1, f2, 0.0F, j, k, i, l);
/*    */     
/* 40 */     a = l.get(0);
/* 41 */     b = l.get(1);
/* 42 */     c = l.get(2);
/*    */     
/* 44 */     int m = paramBoolean ? 1 : 0;
/*    */     
/* 46 */     float f3 = paramyz.z;
/* 47 */     float f4 = paramyz.y;
/*    */     
/* 49 */     d = qh.b(f4 * 3.1415927F / 180.0F) * (1 - m * 2);
/* 50 */     f = qh.a(f4 * 3.1415927F / 180.0F) * (1 - m * 2);
/*    */     
/* 52 */     g = -f * qh.a(f3 * 3.1415927F / 180.0F) * (1 - m * 2);
/* 53 */     h = d * qh.a(f3 * 3.1415927F / 180.0F) * (1 - m * 2);
/* 54 */     e = qh.b(f3 * 3.1415927F / 180.0F);
/*    */   }
/*    */   
/*    */   public static float f;
/*    */   public static float g;
/*    */   public static float h;
/*    */   public static azw b(sv paramsv, double paramDouble)
/*    */   {
/* 62 */     double d1 = paramsv.p + (paramsv.s - paramsv.p) * paramDouble;
/* 63 */     double d2 = paramsv.q + (paramsv.t - paramsv.q) * paramDouble + paramsv.g();
/* 64 */     double d3 = paramsv.r + (paramsv.u - paramsv.r) * paramDouble;
/*    */     
/* 66 */     double d4 = d1 + a * 1.0F;
/* 67 */     double d5 = d2 + b * 1.0F;
/* 68 */     double d6 = d3 + c * 1.0F;
/*    */     
/* 70 */     return azw.a(d4, d5, d6);
/*    */   }
/*    */   
/*    */   public static aji a(ahb paramahb, sv paramsv, float paramFloat) {
/* 74 */     azw localazw = b(paramsv, paramFloat);
/* 75 */     agt localagt = new agt(localazw);
/* 76 */     aji localaji = paramahb.a(localagt.a, localagt.b, localagt.c);
/* 77 */     if (localaji.o().d()) {
/* 78 */       float f1 = alw.b(paramahb.e(localagt.a, localagt.b, localagt.c)) - 0.11111111F;
/* 79 */       float f2 = localagt.b + 1 - f1;
/* 80 */       if (localazw.b >= f2) {
/* 81 */         localaji = paramahb.a(localagt.a, localagt.b + 1, localagt.c);
/*    */       }
/*    */     }
/* 84 */     return localaji;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\baj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */