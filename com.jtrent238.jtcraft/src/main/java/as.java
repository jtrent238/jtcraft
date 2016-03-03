/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class as
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "gamerule";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 26 */   public String c(ac paramac) { return "commands.gamerule.usage"; }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString) { Object localObject1;
/*    */     Object localObject2;
/*    */     Object localObject3;
/* 31 */     if (paramArrayOfString.length == 2) {
/* 32 */       localObject1 = paramArrayOfString[0];
/* 33 */       localObject2 = paramArrayOfString[1];
/*    */       
/* 35 */       localObject3 = d();
/*    */       
/* 37 */       if (((agy)localObject3).e((String)localObject1)) {
/* 38 */         ((agy)localObject3).b((String)localObject1, (String)localObject2);
/* 39 */         a(paramac, this, "commands.gamerule.success", new Object[0]);
/*    */       } else {
/* 41 */         a(paramac, this, "commands.gamerule.norule", new Object[] { localObject1 });
/*    */       }
/*    */       
/* 44 */       return; }
/* 45 */     if (paramArrayOfString.length == 1) {
/* 46 */       localObject1 = paramArrayOfString[0];
/* 47 */       localObject2 = d();
/*    */       
/* 49 */       if (((agy)localObject2).e((String)localObject1)) {
/* 50 */         localObject3 = ((agy)localObject2).a((String)localObject1);
/* 51 */         paramac.a(new fq((String)localObject1).a(" = ").a((String)localObject3));
/*    */       } else {
/* 53 */         a(paramac, this, "commands.gamerule.norule", new Object[] { localObject1 });
/*    */       }
/*    */       
/* 56 */       return; }
/* 57 */     if (paramArrayOfString.length == 0) {
/* 58 */       localObject1 = d();
/* 59 */       paramac.a(new fq(a(((agy)localObject1).b())));
/* 60 */       return;
/*    */     }
/*    */     
/* 63 */     throw new ci("commands.gamerule.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 68 */     if (paramArrayOfString.length == 1)
/* 69 */       return a(paramArrayOfString, d().b());
/* 70 */     if (paramArrayOfString.length == 2) {
/* 71 */       return a(paramArrayOfString, new String[] { "true", "false" });
/*    */     }
/*    */     
/* 74 */     return null;
/*    */   }
/*    */   
/*    */   private agy d() {
/* 78 */     return MinecraftServer.I().a(0).O();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */