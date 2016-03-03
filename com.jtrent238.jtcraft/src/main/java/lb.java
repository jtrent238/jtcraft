/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lb
/*    */   extends IOException
/*    */ {
/* 11 */   private final List a = Lists.newArrayList();
/*    */   private final String b;
/*    */   
/*    */   public lb(String paramString) {
/* 15 */     this.a.add(new ld(null));
/* 16 */     this.b = paramString;
/*    */   }
/*    */   
/*    */   public lb(String paramString, Throwable paramThrowable) {
/* 20 */     super(paramThrowable);
/* 21 */     this.a.add(new ld(null));
/* 22 */     this.b = paramString;
/*    */   }
/*    */   
/*    */   public void a(String paramString) {
/* 26 */     ld.a((ld)this.a.get(0), paramString);
/*    */   }
/*    */   
/*    */   public void b(String paramString) {
/* 30 */     ld.b((ld)this.a.get(0), paramString);
/* 31 */     this.a.add(0, new ld(null));
/*    */   }
/*    */   
/*    */   public String getMessage()
/*    */   {
/* 36 */     return "Invalid " + ((ld)this.a.get(this.a.size() - 1)).toString() + ": " + this.b;
/*    */   }
/*    */   
/*    */   public static lb a(Exception paramException) {
/* 40 */     if ((paramException instanceof lb)) {
/* 41 */       return (lb)paramException;
/*    */     }
/* 43 */     String str = paramException.getMessage();
/* 44 */     if ((paramException instanceof FileNotFoundException)) {
/* 45 */       str = "File not found";
/*    */     }
/* 47 */     return new lb(str, paramException);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */