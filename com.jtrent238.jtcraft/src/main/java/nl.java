/*    */ import io.netty.util.concurrent.GenericFutureListener;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nl
/*    */   implements jq
/*    */ {
/*    */   private final MinecraftServer a;
/*    */   private final ej b;
/*    */   
/*    */   public nl(MinecraftServer paramMinecraftServer, ej paramej)
/*    */   {
/* 17 */     this.a = paramMinecraftServer;
/* 18 */     this.b = paramej;
/*    */   }
/*    */   
/*    */   public void a(jp paramjp)
/*    */   {
/* 23 */     switch (nm.a[paramjp.c().ordinal()]) {
/*    */     case 1: 
/* 25 */       this.b.a(eo.d);
/*    */       fq localfq;
/* 27 */       if (paramjp.d() > 5) {
/* 28 */         localfq = new fq("Outdated server! I'm still on 1.7.10");
/* 29 */         this.b.a(new ju(localfq), new GenericFutureListener[0]);
/* 30 */         this.b.a(localfq);
/* 31 */       } else if (paramjp.d() < 5) {
/* 32 */         localfq = new fq("Outdated client! Please use 1.7.10");
/* 33 */         this.b.a(new ju(localfq), new GenericFutureListener[0]);
/* 34 */         this.b.a(localfq);
/*    */       } else {
/* 36 */         this.b.a(new nn(this.a, this.b));
/*    */       }
/* 38 */       break;
/*    */     case 2: 
/* 40 */       this.b.a(eo.c);
/* 41 */       this.b.a(new nq(this.a, this.b));
/* 42 */       break;
/*    */     default: 
/* 44 */       throw new UnsupportedOperationException("Invalid intention " + paramjp.c());
/*    */     }
/*    */     
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(fj paramfj) {}
/*    */   
/*    */ 
/*    */   public void a(eo parameo1, eo parameo2)
/*    */   {
/* 55 */     if ((parameo2 != eo.d) && (parameo2 != eo.c)) {
/* 56 */       throw new UnsupportedOperationException("Invalid state " + parameo2);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a() {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */