/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import org.apache.commons.lang3.StringUtils;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ld
/*    */ {
/* 52 */   private String a = null;
/* 53 */   private final List b = Lists.newArrayList();
/*    */   
/*    */ 
/*    */ 
/*    */   private void a(String paramString)
/*    */   {
/* 59 */     this.b.add(0, paramString);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public String b()
/*    */   {
/* 67 */     return StringUtils.join(this.b, "->");
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 72 */     if (this.a != null) {
/* 73 */       if (!this.b.isEmpty()) {
/* 74 */         return this.a + " " + b();
/*    */       }
/* 76 */       return this.a;
/*    */     }
/*    */     
/* 79 */     if (!this.b.isEmpty()) {
/* 80 */       return "(Unknown file) " + b();
/*    */     }
/* 82 */     return "(Unknown file)";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */