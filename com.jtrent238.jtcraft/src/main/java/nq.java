/*    */ import io.netty.util.concurrent.GenericFutureListener;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nq
/*    */   implements kh
/*    */ {
/*    */   private final MinecraftServer a;
/*    */   private final ej b;
/*    */   
/*    */   public nq(MinecraftServer paramMinecraftServer, ej paramej)
/*    */   {
/* 14 */     this.a = paramMinecraftServer;
/* 15 */     this.b = paramej;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(fj paramfj) {}
/*    */   
/*    */ 
/*    */   public void a(eo parameo1, eo parameo2)
/*    */   {
/* 25 */     if (parameo2 != eo.c) {
/* 26 */       throw new UnsupportedOperationException("Unexpected change in protocol to " + parameo2);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a() {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(kj paramkj)
/*    */   {
/* 42 */     this.b.a(new ka(this.a.ay()), new GenericFutureListener[0]);
/*    */   }
/*    */   
/*    */   public void a(ki paramki)
/*    */   {
/* 47 */     this.b.a(new jz(paramki.c()), new GenericFutureListener[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */