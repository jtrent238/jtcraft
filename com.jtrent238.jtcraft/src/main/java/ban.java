/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.ByteOrder;
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public class ban
/*    */ {
/* 12 */   private static final Map a = new HashMap();
/* 13 */   private static final java.util.List b = new java.util.ArrayList();
/*    */   
/*    */   public static synchronized int a(int paramInt) {
/* 16 */     int i = GL11.glGenLists(paramInt);
/* 17 */     a.put(Integer.valueOf(i), Integer.valueOf(paramInt));
/*    */     
/* 19 */     return i;
/*    */   }
/*    */   
/*    */   public static synchronized void b(int paramInt) {
/* 23 */     GL11.glDeleteLists(paramInt, ((Integer)a.remove(Integer.valueOf(paramInt))).intValue());
/*    */   }
/*    */   
/*    */   public static synchronized void a() {
/* 27 */     for (Map.Entry localEntry : a.entrySet()) {
/* 28 */       GL11.glDeleteLists(((Integer)localEntry.getKey()).intValue(), ((Integer)localEntry.getValue()).intValue());
/*    */     }
/* 30 */     a.clear();
/*    */   }
/*    */   
/*    */   public static synchronized ByteBuffer c(int paramInt) {
/* 34 */     return ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static IntBuffer f(int paramInt)
/*    */   {
/* 46 */     return c(paramInt << 2).asIntBuffer();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static FloatBuffer h(int paramInt)
/*    */   {
/* 54 */     return c(paramInt << 2).asFloatBuffer();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ban.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */